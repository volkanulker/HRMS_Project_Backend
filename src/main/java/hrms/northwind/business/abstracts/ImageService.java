package hrms.northwind.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Image;

public interface ImageService {
	Result add(MultipartFile photoFile, int employeeId);
    Result delete(int id);
    DataResult<Image> getByJobSeekerId(int employeeId);
    DataResult<Image> getByimageId(int id);
}
