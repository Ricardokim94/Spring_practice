package com.example.ex00.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("vips") @Primary
@Component
public class Vips implements Restaurant {

	@Override
	public Boolean hassalad() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
