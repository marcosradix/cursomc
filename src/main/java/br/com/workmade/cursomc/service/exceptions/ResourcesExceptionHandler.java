package br.com.workmade.cursomc.service.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.workmade.cursomc.util.StandardError;

@ControllerAdvice
public class ResourcesExceptionHandler implements IResourcesExceptionHandler{

	@ExceptionHandler(ObjectNotFoundException.class)
	@Override
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
		StandardError error = new StandardError(
				HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}


	
	
}
