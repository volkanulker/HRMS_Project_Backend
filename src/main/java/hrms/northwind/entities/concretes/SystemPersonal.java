package hrms.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


import lombok.Data;
@Entity // tell spring that this class  is an entity
@Table(name="System_Personals") // give table name of entity in DB

@Data // Connect lombok to the project
public class SystemPersonal extends Person{
	
	@GeneratedValue
	@Column(name="system_personal_id")
	private int systemPersonalId;
	
	public SystemPersonal() {
		
	}
	public SystemPersonal(int id, String name, String surname, String email, int systemPersonalId) {
		super(id, name, surname, email);
		this.systemPersonalId = systemPersonalId;
	}
	
	

}
