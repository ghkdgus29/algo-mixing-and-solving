package site.algomixingandsolving.exception;

import java.net.BindException;
import java.util.LinkedHashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.RequiredArgsConstructor;
import site.algomixingandsolving.util.api.ApiResponse;
import site.algomixingandsolving.util.api.ResponseResult;

@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ApiResponse<Object>> handleCustomException(CustomException customException) {
		LinkedHashMap<String, String> error = new LinkedHashMap<>();
		error.put("type", customException.getClass().getSimpleName());
		error.put("message", customException.getMessage());

		return ResponseEntity.status(customException.getStatus())
			.body(ApiResponse.of(customException.getStatus(), ResponseResult.EXCEPTION_OCCURRED, error));
	}

}
