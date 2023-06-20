package com.segundo_proyecto.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1" )
public class RESTController {

  @GetMapping( value =  "/hello" )
	public String hello( @RequestParam( value = "name", defaultValue = "world" ) String name, @RequestParam( value = "target", defaultValue = "fools" ) String target ) {
		return String.format( "Hello %s, %s!", name, target );
	}
	
}
