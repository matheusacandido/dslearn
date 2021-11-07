package com.devsuperior.dslearnbds.services.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

public class ForbiddenException extends DataIntegrityViolationException {

	private static final long serialVersionUID = 1L;

	public ForbiddenException(String msg) {
		super(msg);
	}
}
