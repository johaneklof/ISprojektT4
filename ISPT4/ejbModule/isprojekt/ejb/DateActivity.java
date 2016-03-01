package isprojekt.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DateActivity")
public class DateActivity implements Serializable {
	private String name;
	private String range;
	private int cost;
	private int romantic;
	private int adrenaline;
	private Location location;//Can only belong to one location

	@Id
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "range")
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	@Column(name = "cost")
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Column(name = "romantic")
	public int getRomantic() {
		return romantic;
	}

	public void setRomantic(int romantic) {
		this.romantic = romantic;
	}

	@Column(name = "adrenaline")
	public int getAdrenaline() {
		return adrenaline;
	}

	public void setAdrenaline(int adrenaline) {
		this.adrenaline = adrenaline;
	}
	
	@ManyToOne
	@JoinColumn(name="locationName", referencedColumnName="name")
	public Location getLocation(){
		return location;
	}
	public void setLocation(Location location){
		this.location = location;
	}

}
