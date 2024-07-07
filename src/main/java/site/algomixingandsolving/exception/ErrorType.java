package site.algomixingandsolving.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ErrorType {

	;

	private final HttpStatus status;
	private final String message;

	ErrorType(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}

}
