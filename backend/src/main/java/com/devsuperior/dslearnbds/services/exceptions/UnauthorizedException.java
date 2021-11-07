package com.devsuperior.dslearnbds.services.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

public class UnauthorizedException extends DataIntegrityViolationException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedException(String msg) {
		super(msg);
	}
}
