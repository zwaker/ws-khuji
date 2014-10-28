package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KHUJI_JOB_ITEM database table.
 * 
 */
@Entity
@Table(name="KHUJI_JOB_ITEM")
public class KhujiJobItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="JOB_ADVERTISEMENT_DATE")
	private String jobAdvertisementDate;

    @Lob()
	@Column(name="JOB_DESCRIPTION_PARTA")
	private String jobDescriptionParta;

    @Lob()
	@Column(name="JOB_DESCRIPTION_PARTB")
	private String jobDescriptionPartb;

    @Lob()
	@Column(name="JOB_HEADER_IMAGE")
	private byte[] jobHeaderImage;

	@Column(name="JOB_TITLE")
	private String jobTitle;

	//bi-directional many-to-one association to KhujiAddress
    @ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private KhujiAddress khujiAddress;

	//bi-directional many-to-one association to KhujiCompany
    @ManyToOne
	@JoinColumn(name="KHUJI_COMPANY_ID")
	private KhujiCompany khujiCompany;

	//bi-directional many-to-one association to KhujiCompanyAgent
    @ManyToOne
	@JoinColumn(name="KHUJI_COMPANY_AGENT_ID")
	private KhujiCompanyAgent khujiCompanyAgent;

	//bi-directional many-to-one association to KhujiIndustryType
    @ManyToOne
	@JoinColumn(name="KHUJI_INDUSTRY_TYPE_ID")
	private KhujiIndustryType khujiIndustryType;

	//bi-directional many-to-one association to KhujiSubIndustryType
    @ManyToOne
	@JoinColumn(name="KHUJI_SUB_INDUSTRY_TYPE_ID")
	private KhujiSubIndustryType khujiSubIndustryType;

    public KhujiJobItem() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobAdvertisementDate() {
		return this.jobAdvertisementDate;
	}

	public void setJobAdvertisementDate(String jobAdvertisementDate) {
		this.jobAdvertisementDate = jobAdvertisementDate;
	}

	public String getJobDescriptionParta() {
		return this.jobDescriptionParta;
	}

	public void setJobDescriptionParta(String jobDescriptionParta) {
		this.jobDescriptionParta = jobDescriptionParta;
	}

	public String getJobDescriptionPartb() {
		return this.jobDescriptionPartb;
	}

	public void setJobDescriptionPartb(String jobDescriptionPartb) {
		this.jobDescriptionPartb = jobDescriptionPartb;
	}

	public byte[] getJobHeaderImage() {
		return this.jobHeaderImage;
	}

	public void setJobHeaderImage(byte[] jobHeaderImage) {
		this.jobHeaderImage = jobHeaderImage;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public KhujiAddress getKhujiAddress() {
		return this.khujiAddress;
	}

	public void setKhujiAddress(KhujiAddress khujiAddress) {
		this.khujiAddress = khujiAddress;
	}
	
	public KhujiCompany getKhujiCompany() {
		return this.khujiCompany;
	}

	public void setKhujiCompany(KhujiCompany khujiCompany) {
		this.khujiCompany = khujiCompany;
	}
	
	public KhujiCompanyAgent getKhujiCompanyAgent() {
		return this.khujiCompanyAgent;
	}

	public void setKhujiCompanyAgent(KhujiCompanyAgent khujiCompanyAgent) {
		this.khujiCompanyAgent = khujiCompanyAgent;
	}
	
	public KhujiIndustryType getKhujiIndustryType() {
		return this.khujiIndustryType;
	}

	public void setKhujiIndustryType(KhujiIndustryType khujiIndustryType) {
		this.khujiIndustryType = khujiIndustryType;
	}
	
	public KhujiSubIndustryType getKhujiSubIndustryType() {
		return this.khujiSubIndustryType;
	}

	public void setKhujiSubIndustryType(KhujiSubIndustryType khujiSubIndustryType) {
		this.khujiSubIndustryType = khujiSubIndustryType;
	}
	
}