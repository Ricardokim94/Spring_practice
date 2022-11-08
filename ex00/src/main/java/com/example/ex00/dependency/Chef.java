package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chef {
	private final Restaurant rs;

	@Autowired
	public Chef(Restaurant rs) {
		super();
		this.rs = rs;
	}
	
	
	
	
}
