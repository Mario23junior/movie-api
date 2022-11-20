package com.api.movie.exceptions;

public class ErroModelReturn extends RuntimeException {

	private static final long serialVersionUID = 1L;
  
	public ErroModelReturn(String message) {
		super(message);
	}
}
