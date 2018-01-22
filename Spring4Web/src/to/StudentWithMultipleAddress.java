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
@Table(name="student")
public class StudentWithMultipleAddress {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String country;
	@Column
    @OneToMany(targetEntity=StudentAddress.class)
	private List<StudentAddress> addresses;
	
	public StudentWithMultipleAddress() {
		
	}
	public StudentWithMultipleAddress(String name, List<StudentAddress> addresses) {
		this.name = name;
		this.addresses = addresses;
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
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<StudentAddress> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<StudentAddress> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString(){
		return "id="+id+", name="+name+", country="+country;
	}
}
