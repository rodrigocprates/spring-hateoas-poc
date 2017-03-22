package com.hateoas.model;

// add capabilities to generate "_link" property into our json
import org.springframework.hateoas.ResourceSupport;

// Jackson JSON lib marshal this pojo to json
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting extends ResourceSupport {

	private final String content;
	
	@JsonCreator
	public Greeting(@JsonProperty("content") String content) {
		this.content = content;
	}
	
	public String getContent() {
        return content;
    }
	
}
