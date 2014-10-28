package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KHUJI_USER database table.
 * 
 */
@Entity
@Table(name="KHUJI_USER")
public class KhujiUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String username;

	private String active;

	@Column(name="ADDRESS_ID")
	private int addressId;

	private String birthyear;

	@Column(name="FIRST_NAME")
	private String firstName;

	private String gender;

	@Column(name="LAST_NAME")
	private String lastName;

	private String password;

    @Lob()
	@Column(name="profile_image")
	private byte[] profileImage;

	@Column(name="USER_IS_AGENT")
	private String userIsAgent;

    public KhujiUser() {
    }

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getBirthyear() {
		return this.birthyear;
	}

	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getProfileImage() {
		return this.profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public String getUserIsAgent() {
		return this.userIsAgent;
	}

	public void setUserIsAgent(String userIsAgent) {
		this.userIsAgent = userIsAgent;
	}

}