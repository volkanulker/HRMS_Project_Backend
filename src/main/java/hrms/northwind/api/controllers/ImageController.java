package hrms.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hrms.northwind.business.abstracts.ImageService;
import hrms.northwind.core.utilities.results.DataResult;
import hrms.northwind.core.utilities.results.Result;
import hrms.northwind.entities.concretes.Image;

@RestController
@RequestMapping("/api/image")
public class ImageController {
	private ImageService imageService;

	@Autowired
	public ImageController(ImageService imageService) {
		this.imageService = imageService;
	}
	
	@GetMapping("/getByJobSeekerId")
	public DataResult<Image> getByJobSeekerId(@RequestParam int jobSeekerId){
		return imageService.getByJobSeekerId(jobSeekerId);
		
	}
	
	@PostMapping("/addImage")
	public Result addImage(@RequestParam("photo") MultipartFile photo, @RequestParam("id") int id) {
		return this.imageService.add(photo, id);
	}
	
	@PostMapping("/deleteImage")
	public Result deleteImage(@RequestParam("id") int id) {
		return this.imageService.delete(id);
	}
	

}
