package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.Verification;

public interface VerificationDao extends JpaRepository <Verification,Integer>{

}
