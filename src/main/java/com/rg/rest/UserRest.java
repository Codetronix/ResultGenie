package com.rg.rest;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.rg.domain.User;
import com.rg.service.intf.UserService;

@Controller
@RequestMapping( "/rest/v1" )
public class UserRest {

	@Autowired
	private UserService uService;

	@RequestMapping( value = "/user/login", method = RequestMethod.POST )
	public ResponseEntity<JSONObject> login( @RequestBody User user ) throws Exception
	{
		try
		{
			return uService.login(user);
		}
		catch( Exception e )
		{
			e.printStackTrace();
			throw e;
		}
	}
	@RequestMapping( value = "/user/fetchResult", method = RequestMethod.GET )
	public ResponseEntity<JSONObject> fetchResult() throws Exception
	{
		try
		{
			return uService.fetchResult();
		}
		catch( Exception e )
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	

}
