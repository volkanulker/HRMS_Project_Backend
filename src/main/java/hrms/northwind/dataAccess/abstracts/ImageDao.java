package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image,Integer>{
	Image getByJobSeeker_jobseekerId(int jobSeekerId);
    Image getByimageId(int id);
}
