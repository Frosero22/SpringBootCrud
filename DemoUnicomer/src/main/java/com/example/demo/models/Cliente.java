package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	//ESTE OBJETO HACE REFERENCIA A LA BASE DE DATOS
	//EL ID SE GENERA AUTOMATICAMENTE DEBIDO A LA PROPIEDAD @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="birthay")
	private String birthay;
	@Column(name="gender")
	private String gender;
	@Column(name="cellPhone")
	private String cellPhone;
	@Column(name="homePhone")
	private String homePhone;
	@Column(name="addressHome")
	private String addressHome;
	@Column(name="profession")
	private String profession;
	@Column(name="incomes")
	private String incomes;
	
	public Cliente() {
		super();
	}

	public Cliente(String firstName, String lastName, String birthay, String gender, String cellPhone, String homePhone,
			String addressHome, String profession, String incomes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthay = birthay;
		this.gender = gender;
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.addressHome = addressHome;
		this.profession = profession;
		this.incomes = incomes;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthay() {
		return birthay;
	}

	public void setBirthay(String birthay) {
		this.birthay = birthay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getAddressHome() {
		return addressHome;
	}

	public void setAddressHome(String addressHome) {
		this.addressHome = addressHome;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getIncomes() {
		return incomes;
	}

	public void setIncomes(String incomes) {
		this.incomes = incomes;
	}
	
	
	
	
}
