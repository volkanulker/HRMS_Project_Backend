package hrms.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Entity // tell spring that this class  is an entity
@Table(name="System_Personals") // give table name of entity in DB
@AllArgsConstructor
@NoArgsConstructor
@Data // Connect lombok to the project
@EqualsAndHashCode(callSuper = true)
public class SystemPersonal extends Person{
	
	@GeneratedValue
	@Column(name="system_personal_id")
	private int systemPersonalId;
	

	

}
