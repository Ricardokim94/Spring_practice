package com.example.ex00.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("outback")
@Component
public class Outback implements Restaurant {

	@Override
	public Boolean hassalad() {
		return true;
	}


}
