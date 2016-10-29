package com.xmansion.kingcross.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by [)/\ on 29/10/16.
 */
@RestController
public class BaseController {

	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public ResponseEntity<String> echo() {
		String responseText = "Potter" + " says howdy !!!!";
		return new ResponseEntity<String>(
				responseText, HttpStatus.OK);
	}

	@RequestMapping(value = "/secured_echo", method = RequestMethod.GET)
	public ResponseEntity<String> securedEcho() {
		String responseText = "Potter & Dumbledore" + " says howdy !!!!";
		return new ResponseEntity<String>(
				responseText, HttpStatus.OK);
	}

}
