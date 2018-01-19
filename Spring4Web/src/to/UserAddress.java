package to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author vijay
 *
 */
@Entity
@Table(name="user_address")
public class UserAddress {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int personsId;
	
	public int getPersonsId() {
		return personsId;
	}

	public void setPersonsId(int personsId) {
		this.personsId = personsId;
	}



	private String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}



	private String streetAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	@Override
	public String toString(){
		return "id="+id+", name="+city+", country="+streetAddress;
	}
}
