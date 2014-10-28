package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the KHUJI_COMPANY_AGENT database table.
 * 
 */
@Entity
@Table(name="KHUJI_COMPANY_AGENT")
public class KhujiCompanyAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;

	private String username;

	//bi-directional many-to-one association to KhujiCompany
    @ManyToOne
	@JoinColumn(name="COMPANY_ID")
	private KhujiCompany khujiCompany;

	//bi-directional many-to-one association to KhujiJobItem
	@OneToMany(mappedBy="khujiCompanyAgent")
	private Set<KhujiJobItem> khujiJobItems;

    public KhujiCompanyAgent() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public KhujiCompany getKhujiCompany() {
		return this.khujiCompany;
	}

	public void setKhujiCompany(KhujiCompany khujiCompany) {
		this.khujiCompany = khujiCompany;
	}
	
	public Set<KhujiJobItem> getKhujiJobItems() {
		return this.khujiJobItems;
	}

	public void setKhujiJobItems(Set<KhujiJobItem> khujiJobItems) {
		this.khujiJobItems = khujiJobItems;
	}
	
}