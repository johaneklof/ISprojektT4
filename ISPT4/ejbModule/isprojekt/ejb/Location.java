package isprojekt.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location implements Serializable {

	private String name;
	private String address;
	private String country;
	private Set<DateActivity> dateActivity;//Location can have many dateactivities

	@Id
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@OneToMany(mappedBy="location", fetch=FetchType.EAGER)
	public Set<DateActivity> getDateActivity(){
		return dateActivity;
	}
	public void setDateActivity(Set<DateActivity> dateActivity){
		this.dateActivity = dateActivity;
	}

}
