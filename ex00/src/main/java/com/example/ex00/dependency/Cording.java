package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Component
@Getter
//@AllArgsConstructor    //여기안에 있는 모든 필드를 초기화 할수 있 생성자를 만드는 친구임  
@RequiredArgsConstructor //non null 이나 final 인 애들만 초기화에 올려줌  
public class Cording {
	
//1]필드주입
	//굉장히 편하게 주입할 수 있으나 순환 참조(무한루)시 오류가 발생하지 않기 때문에 StackOverFlow 발생.
	//final 을 붙이면 오류난다! =다른곳에서 변형 가능 
//	@Autowired
	
	private final Computer computer;

	
//2]생성자 주입 {가장 많이 쓴다!!}
	//순환 참조 시 컴파일러가 인지 가능, 오류 발생시킨다.
	//메모리에 할당 하면서 초기값으로 주입되므로 final 키워드가 사용가능,다른 곳에서 변형 불가능. = 안전하다는 것임 
	//의존성 주입이 되지 않으면 객체가 생성되지 않으므로 
//	@Autowired
//	public Cording(Computer computer) {
//		super();
//		this.computer = computer;
//	}
	
	
//3]setter주입
	//굉장히 편하게 주입할 수 있으나 순환 참조(무한루)시 오류가 발생하지 않기 때문에 StackOverFlow 발생.
	//final 을 붙이면 오류난다! =다른곳에서 변형 가능 
	//public이므로 외부에서 주입이 가능함!
//	@Autowired
//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}

	
}
