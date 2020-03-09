package com.information.database.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.information.database.error.ResourceNotFoundDetail;
import com.information.database.error.ResourceNotFoundException;
import com.information.database.model.Pessoa;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public Pessoa hendleResourceNotFoundException(ResourceNotFoundException rnfEXception) {
		ResourceNotFoundDetail rnfDetail = ResourceNotFoundDetail.Builder.newBuilder()
				.timestamp(new Date().getTime())
				.status(HttpStatus.NOT_FOUND.value())
				.title("Resource Not Found")
				.detail(rnfEXception.getMessage())
				.developerMessage(rnfEXception.getClass().getName())
				.build();
		return new Pessoa(rnfDetail, HttpStatus.NOT_FOUND);
	}
}
