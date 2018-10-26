package br.com.workmade.cursomc.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3424275504562355933L;

	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
