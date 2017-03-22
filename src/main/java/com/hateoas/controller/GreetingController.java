package com.hateoas.controller;

import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hateoas.model.Greeting;

@RestController
public class GreetingController {

	private static final String TEMPLATE_MESSAGE = "Hello, %s!";

	@RequestMapping("/greeting")
	public HttpEntity<Greeting> greeting(
			@RequestParam(name = "name", required = false, defaultValue = "Prates") String name) {

		Greeting greeting = new Greeting(String.format(TEMPLATE_MESSAGE, name));

		// adds the _link property pointing to itself url
		greeting.add(ControllerLinkBuilder
				.linkTo(ControllerLinkBuilder.methodOn(GreetingController.class).greeting(name)).withSelfRel());

		return new ResponseEntity<>(greeting, HttpStatus.OK);

	}

}
