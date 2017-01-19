package com.xmansion.kingcross.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;

/**
 * Created by [)/\ on 29/10/16.
 */

@RestController
@Slf4j
public class BaseController {

	@Autowired
	HttpServletRequest httpServletRequest;

	private String getHeaderDetails() {

		String responseText = "Welcome to Kingcross.\n" +
				"This is where our journey starts.\n" +
				"This application is in Spring Boot 1.4.0 with Java 8.\n" +
				"This application is here to demonstrate Keycloak Integration and Kong Usage.\n" +
				"This application requires you to have two roles Role_1 and Role_2 and Role_3. Sorry for my maths." +
				" \n\n\n\n\n";
		StringBuilder stringBuilder = new StringBuilder(responseText);

		Collections
				.list(httpServletRequest.getHeaderNames())
				.stream()
				.forEach(header->stringBuilder
						.append("\n" + header + "\t" + httpServletRequest.getHeader(header) )
				);
		return  stringBuilder.toString();
	}

	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public ResponseEntity<String> echo() {
		return new ResponseEntity<String>(
				getHeaderDetails(), HttpStatus.OK);
	}

	@RequestMapping(value = "/secured-echo", method = RequestMethod.GET)
	public ResponseEntity<String> securedEcho() {

		String responseText = "\n\t--------------Secured Page--------------\n\n"
				+getHeaderDetails();
		return new ResponseEntity<String>(
				responseText, HttpStatus.OK);
	}

}
