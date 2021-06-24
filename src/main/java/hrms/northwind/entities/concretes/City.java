package hrms.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="Cities")
@Entity
@Data
public class City {
	@Id
	@GeneratedValue
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="city_name")
	private String cityName;
	
	public City(int cityId, String cityName) {
		this.cityId = cityId;
		this.cityName = cityName;
	}
	

}
