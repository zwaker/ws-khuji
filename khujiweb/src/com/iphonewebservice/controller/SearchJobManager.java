package com.iphonewebservice.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.iphoneservice.khuji.SearchJobManagerService;
import com.iphoneservice.khuji.bean.SearchJobCriteria;


@Named
@RequestScoped
public class SearchJobManager implements Serializable{
	private static final long serialVersionUID = 1L;

	private SearchJobCriteria searchJobCriteria=new SearchJobCriteria();
	
	
	public SearchJobCriteria getSearchJobCriteria() {
		return searchJobCriteria;
	}


	public void setSearchJobCriteria(SearchJobCriteria searchJobCriteria) {
		this.searchJobCriteria = searchJobCriteria;
	}


	@Inject
	private SearchJobManagerService searchJobManagerService;

	public SearchJobManagerService getSearchJobManagerService() {
		return searchJobManagerService;
	}

	
	public void setSearchJobManagerService(
			SearchJobManagerService searchJobManagerService) {
		this.searchJobManagerService = searchJobManagerService;
	}


	public String respondToRequest() {
		return null;
	}

}
