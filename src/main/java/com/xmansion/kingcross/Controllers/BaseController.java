package com.xmansion.kingcross.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by [)/\ on 29/10/16.
 */
@RestController
@Slf4j
public class BaseController {

	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public ResponseEntity<String> echo() {
		log.info("Grounds are not all that secured.");
		log.debug("Hagrid is watching over, but shhhhhhh!!!!!!!");
		log.error("Ahhh!!! there is no rule breaking here");
		log.trace("Mischief Managed!");
		log.warn("Dumbledore might still be aware of all are mischief");
		String responseText = "Potter" + " says howdy !!!!";
		return new ResponseEntity<String>(
				responseText, HttpStatus.OK);
	}

	@RequestMapping(value = "/secured_echo", method = RequestMethod.GET)
	public ResponseEntity<String> securedEcho() {
		log.info("We are in the secured world");
		String responseText = "Potter & Dumbledore" + " says howdy !!!!";
		return new ResponseEntity<String>(
				responseText, HttpStatus.OK);
	}

}
