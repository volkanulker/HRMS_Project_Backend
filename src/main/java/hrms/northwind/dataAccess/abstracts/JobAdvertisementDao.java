package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao  extends JpaRepository <JobAdvertisement,Integer>{

}
