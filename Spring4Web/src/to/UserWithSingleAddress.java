package to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.*;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author vijay
 *
 */
@Entity
@Table(name="user")
public class UserWithSingleAddress {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String country;

    @OneToOne(targetEntity=UserAddress.class)
	private UserAddress address;

    public UserWithSingleAddress() {
    	
    }
  
	public UserWithSingleAddress(String name, UserAddress address) {
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	public UserAddress getAddress() {
		return this.address;
	}

	public void setAddress(UserAddress address) {
		this.address = address;
	}
	@Override
	public String toString(){
		return "id="+id+", name="+name+", country="+country;
	}
}
