package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.EmployerVerification;

public interface EmployerVerificationDao extends JpaRepository <EmployerVerification,Integer>{

}
