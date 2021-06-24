package hrms.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.Data;


@Entity // tell spring that this class  is an entity
@Table(name = "Persons")// give table name of entity in DB
@Inheritance(strategy=InheritanceType.JOINED)
@Data // Connect lombok to the project
public  class Person {
	@Id // tell that this is primary key
	@GeneratedValue // tell that primary key increased one by one
	@Column(name="person_id")
	private int personId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="email")
	private String email;
	public Person() {
		
	}
	public Person(int id, String name, String surname, String email) {
		this.personId = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
}
