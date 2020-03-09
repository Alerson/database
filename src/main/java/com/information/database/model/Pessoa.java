package com.information.database.model;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.information.database.error.ResourceNotFoundDetail;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ResourceNotFoundDetail rnfDetail;
	HttpStatus statusError;

	public Pessoa() {
	}

	public Pessoa(ResourceNotFoundDetail rnfDetail, HttpStatus notFound) {
		this.rnfDetail = rnfDetail;
		this.statusError = notFound;
	}

}
