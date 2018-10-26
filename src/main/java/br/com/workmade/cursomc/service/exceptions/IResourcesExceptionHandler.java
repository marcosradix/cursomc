package br.com.workmade.cursomc.service.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import br.com.workmade.cursomc.util.StandardError;

public interface IResourcesExceptionHandler {

	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request);
}
