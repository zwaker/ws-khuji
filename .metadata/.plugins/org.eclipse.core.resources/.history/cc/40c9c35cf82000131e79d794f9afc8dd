package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KHUJI_APPLICATION database table.
 * 
 */
@Entity
@Table(name="KHUJI_APPLICATION")
public class KhujiApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

    @Lob()
	@Column(name="COVER_LETTER_ATTACHMENT")
	private byte[] coverLetterAttachment;

	@Column(name="KHUJI_JOB_ITEM_ID")
	private String khujiJobItemId;

	@Column(name="KHUJI_USERNAME")
	private String khujiUsername;

    @Lob()
	@Column(name="RESUME_ATTACHMENT")
	private byte[] resumeAttachment;

    public KhujiApplication() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getCoverLetterAttachment() {
		return this.coverLetterAttachment;
	}

	public void setCoverLetterAttachment(byte[] coverLetterAttachment) {
		this.coverLetterAttachment = coverLetterAttachment;
	}

	public String getKhujiJobItemId() {
		return this.khujiJobItemId;
	}

	public void setKhujiJobItemId(String khujiJobItemId) {
		this.khujiJobItemId = khujiJobItemId;
	}

	public String getKhujiUsername() {
		return this.khujiUsername;
	}

	public void setKhujiUsername(String khujiUsername) {
		this.khujiUsername = khujiUsername;
	}

	public byte[] getResumeAttachment() {
		return this.resumeAttachment;
	}

	public void setResumeAttachment(byte[] resumeAttachment) {
		this.resumeAttachment = resumeAttachment;
	}

}