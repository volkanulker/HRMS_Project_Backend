package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.JobSeekerVerification;

public interface JobSeekerVerificationDao extends JpaRepository <JobSeekerVerification,Integer>{

}
