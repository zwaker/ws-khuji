package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the KHUJI_SUB_INDUSTRY_TYPE database table.
 * 
 */
@Entity
@Table(name="KHUJI_SUB_INDUSTRY_TYPE")
public class KhujiSubIndustryType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="KHUJI_INDUSTRY_ID")
	private String khujiIndustryId;

	private String name;

	//bi-directional many-to-one association to KhujiJobItem
	@OneToMany(mappedBy="khujiSubIndustryType")
	private Set<KhujiJobItem> khujiJobItems;

    public KhujiSubIndustryType() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKhujiIndustryId() {
		return this.khujiIndustryId;
	}

	public void setKhujiIndustryId(String khujiIndustryId) {
		this.khujiIndustryId = khujiIndustryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<KhujiJobItem> getKhujiJobItems() {
		return this.khujiJobItems;
	}

	public void setKhujiJobItems(Set<KhujiJobItem> khujiJobItems) {
		this.khujiJobItems = khujiJobItems;
	}
	
}