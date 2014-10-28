package com.iphoneservice.khuji.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the KHUJI_LOCATION database table.
 * 
 */
@Entity
@Table(name="KHUJI_LOCATION")
public class KhujiLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String area;

	private String subarea;

    public KhujiLocation() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubarea() {
		return this.subarea;
	}

	public void setSubarea(String subarea) {
		this.subarea = subarea;
	}

}