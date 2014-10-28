package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the KHUJI_ADDRESS database table.
 * 
 */
@Entity
@Table(name="KHUJI_ADDRESS")
public class KhujiAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ADDRESS_LINE1")
	private String addressLine1;

	@Column(name="ADDRESS_LINE2")
	private String addressLine2;

	private String country;

	@Column(name="KHUJI_LOCATION_ID")
	private String khujiLocationId;

	@Column(name="LAT_LONG")
	private String latLong;

	private String postcode;

	//bi-directional many-to-one association to KhujiJobItem
	@OneToMany(mappedBy="khujiAddress")
	private Set<KhujiJobItem> khujiJobItems;

    public KhujiAddress() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getKhujiLocationId() {
		return this.khujiLocationId;
	}

	public void setKhujiLocationId(String khujiLocationId) {
		this.khujiLocationId = khujiLocationId;
	}

	public String getLatLong() {
		return this.latLong;
	}

	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Set<KhujiJobItem> getKhujiJobItems() {
		return this.khujiJobItems;
	}

	public void setKhujiJobItems(Set<KhujiJobItem> khujiJobItems) {
		this.khujiJobItems = khujiJobItems;
	}
	
}