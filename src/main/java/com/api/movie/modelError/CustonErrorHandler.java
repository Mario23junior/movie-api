package com.api.movie.modelError;

import java.util.Date;

import com.api.movie.exceptions.ErroModelReturn;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustonErrorHandler {
   
	@ExceptionHandler(ErroModelReturn.class)
 	public ModelErroReturn CustonErroHandlerReturn(ErroModelReturn ex, WebRequest request) {
		ModelErroReturn error = new ModelErroReturn(
				HttpStatus.NO_CONTENT.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
				
		return error;
				
 	}
}