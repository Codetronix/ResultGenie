package com.rg.exception;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {

	@SuppressWarnings( "unchecked" )
	@ExceptionHandler( CustomGenericException.class )
	public ResponseEntity<JSONObject> handleCustomException( CustomGenericException e )
	{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("errorcode", e.getCode());
		jsonObject.put("errorMessage", e.getMessage());
		
		return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
