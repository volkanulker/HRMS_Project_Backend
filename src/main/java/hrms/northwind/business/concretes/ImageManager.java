package hrms.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.northwind.business.abstracts.ImageService;
import hrms.northwind.business.abstracts.JobSeekerService;
import hrms.northwind.core.adapters.CloudService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.ErrorResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.core.utilities.results.SuccessDataResult;
import hrms.northwind.core.utilities.results.SuccessResult;
import hrms.northwind.dataAccess.abstracts.ImageDao;
import hrms.northwind.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{
	private ImageDao imageDao;
	private CloudService cloudService;
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public ImageManager(ImageDao imageDao, CloudService cloudService, JobSeekerService jobSeekerService) {
		this.imageDao = imageDao;
		this.cloudService = cloudService;
		this.jobSeekerService = jobSeekerService;
	}

	 @Override
     public Result add(MultipartFile photoFile, int jobSeekerId) {
         var imageByJobSeekerId = imageDao.getByJobSeeker_jobseekerId(jobSeekerId);
         
         if (imageByJobSeekerId == null) return new ErrorResult("Employee Is Null");
         var result = this.cloudService.upload(photoFile);
         if(!result.isSuccess()) {
             return new ErrorResult();
         }
         Image photo = new Image();
         photo.setJobSeeker(jobSeekerService.getByJobSeekerId(jobSeekerId));

       
         photo.setImageLink(result.getData().get("url"));
         photo.setUploadedDate(result.getData().get("created_at"));
         this.imageDao.save(photo);
         return new SuccessResult("Photo added");

     }

     @Override
     public Result delete(int id) {
         var image = imageDao.getByimageId(id);
         this.imageDao.delete(image);
         return new SuccessResult("Photo deleted");

     }

     @Override
     public DataResult<Image> getByJobSeekerId(int id) {
         return new SuccessDataResult<>(imageDao.getByJobSeeker_jobseekerId(id));
     }

     @Override
     public DataResult<Image> getByimageId(int id) {
         return new SuccessDataResult<>(imageDao.getByimageId(id));
     }
}
