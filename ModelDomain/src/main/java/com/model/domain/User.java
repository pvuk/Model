package com.model.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@NamedQueries({ @NamedQuery(name = "User.findByPrimaryEmail", query = "Select u from User u where u.primaryEmail = ?1"), @NamedQuery(name = "User.findByRole", query = "Select u from User u where u.role = ?1"),
		@NamedQuery(name = "User.findByUserId", query = "Select u from User u where u.userId = ?1"), @NamedQuery(name = "User.findByAll", query = "Select u from User u order by u.userName ASC"),
		@NamedQuery(name = "User.findByUserName", query = "Select u from User u where u.userName = ?1"), })
public class User {
	/**
	 * table - user
	 * 
	 * userId bigint(20) NO PRI auto_increment passwordId bigint(20) NO MUL
	 * userImageId bigint(20) YES MUL role varchar(45) YES user userName
	 * varchar(45) NO UNI firstName varchar(45) NO middleName varchar(45) YES
	 * lastName varchar(45) NO fathersOrGuardianName varchar(45) NO primaryEmail
	 * varchar(45) NO UNI secondaryEmail varchar(45) YES dateOfBirth datetime NO
	 * gender varchar(45) NO countryCode char(2) NO regionOrder char(2) NO city
	 * varchar(45) NO mobile varchar(45) NO phone varchar(45) YES landLine
	 * varchar(45) YES qualification varchar(45) YES previousExperienceIfAny
	 * varchar(45) YES bloodGroup varchar(45) YES height varchar(10) YES hobbies
	 * varchar(45) YES preminentAddress varchar(180) NO presentAddress
	 * varchar(180) YES createdOn datetime NO updatedOn datetime YES 0000-00-00
	 * 00:00:00 isActivate bit(1) YES b'0'
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	private String role;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fathersOrGuardianName;
	private String userName;
	private String primaryEmail;
	private String secondaryEmail;
	private Date dateOfBirth;
	private String gender;
	private String countryCode;
	private String regionOrder;
	private String city;
	private String mobile;
	private String phone;
	private String landLine;
	private String qualification;
	private String previousExperienceIfAny;
	private String bloodGroup;
	private String height;
	private String hobbies;
	private String permanentAddress;
	private String presentAddress;
	private Date createdOn;
	private Date updatedOn;
	private Boolean isActivate;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFathersOrGuardianName() {
		return fathersOrGuardianName;
	}

	public void setFathersOrGuardianName(String fathersOrGuardianName) {
		this.fathersOrGuardianName = fathersOrGuardianName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRegionOrder() {
		return regionOrder;
	}

	public void setRegionOrder(String regionOrder) {
		this.regionOrder = regionOrder;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLandLine() {
		return landLine;
	}

	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPreviousExperienceIfAny() {
		return previousExperienceIfAny;
	}

	public void setPreviousExperienceIfAny(String previousExperienceIfAny) {
		this.previousExperienceIfAny = previousExperienceIfAny;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Boolean getIsActivate() {
		return isActivate;
	}

	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}

}
