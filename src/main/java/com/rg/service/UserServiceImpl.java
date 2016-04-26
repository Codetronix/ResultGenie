package com.rg.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rg.domain.User;
import com.rg.exception.CustomGenericException;
import com.rg.repositories.UserRepository;
import com.rg.service.intf.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@SuppressWarnings( "unchecked" )
	public ResponseEntity<JSONObject> login( User user ) throws Exception
	{
		JSONObject jsonObject = new JSONObject();
		try
		{
			if( user.getUsername() == null || user.getPassword() == null )
			{
				throw new CustomGenericException("444", "required parameters not found");
			}
			User u = userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
			if( u == null )
			{
				throw new CustomGenericException("404", "no user exists");
			}
			jsonObject.put("code", 200);
			jsonObject.put("message", "login successfull");
			return new ResponseEntity<JSONObject>(jsonObject, HttpStatus.OK);
		}
		catch( Exception e )
		{
			e.printStackTrace();
			throw e;
		}

	}

}
