package com.rg.service.intf;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import com.rg.domain.User;


public interface UserService {

	public ResponseEntity<JSONObject> login( User user ) throws Exception;

	public ResponseEntity<JSONObject> fetchResult();
	
	

}
