package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the KHUJI_COMPANY database table.
 * 
 */
@Entity
@Table(name="KHUJI_COMPANY")
public class KhujiCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="ADDRESS_ID")
	private String addressId;

	private String name;

	//bi-directional many-to-one association to KhujiCompanyAgent
	@OneToMany(mappedBy="khujiCompany")
	private Set<KhujiCompanyAgent> khujiCompanyAgents;

	//bi-directional many-to-one association to KhujiJobItem
	@OneToMany(mappedBy="khujiCompany")
	private Set<KhujiJobItem> khujiJobItems;

    public KhujiCompany() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<KhujiCompanyAgent> getKhujiCompanyAgents() {
		return this.khujiCompanyAgents;
	}

	public void setKhujiCompanyAgents(Set<KhujiCompanyAgent> khujiCompanyAgents) {
		this.khujiCompanyAgents = khujiCompanyAgents;
	}
	
	public Set<KhujiJobItem> getKhujiJobItems() {
		return this.khujiJobItems;
	}

	public void setKhujiJobItems(Set<KhujiJobItem> khujiJobItems) {
		this.khujiJobItems = khujiJobItems;
	}
	
}