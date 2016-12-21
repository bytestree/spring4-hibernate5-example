package com.bytestree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 * 
 */
@Entity
@Table(name = "employee")
public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = 4910225916550731446L;

	private Long id;
	private String firstname;
	private String lastname;
	private String designation;
	private Integer salary;

	public Employee() {
	}

	public Employee(Long id) {
		this.id = id;
	}

	public Employee(Long id, String firstname, String lastname, String designation, Integer salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee(String firstname, String lastname, String designation, Integer salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
		this.salary = salary;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "firstname", length = 50)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", length = 50)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "designation", length = 50)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(name = "salary")
	public Integer getSalary() {
		return this.salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Id: ").append(this.id).append(", firstName: ").append(this.firstname).append(", lastName: ")
				.append(this.lastname).append(", Designation: ").append(this.designation).append(", Salary: ")
				.append(this.salary);
		return sb.toString();
	}

}
