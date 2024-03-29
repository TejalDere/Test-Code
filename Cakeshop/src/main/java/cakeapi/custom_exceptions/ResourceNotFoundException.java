package cakeapi.custom_exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 9970742130L;

	public ResourceNotFoundException(String mesg) {
		super(mesg);
	}
}
