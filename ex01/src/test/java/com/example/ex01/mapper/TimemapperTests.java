package com.example.ex01.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //파일을 참조해서 단위테스트 돌아갈수 있게 한는 것
@Log4j
public class TimemapperTests {
	@Autowired
	private TimeMapper timeMapper;
	
//	@Test
//	public void testGetTime() {
//		log.info(timeMapper.getClass().getName());
//		log.info(timeMapper.getTime());
//	}
	
	@Test
	public void testGetTime2() {
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime2()); 
	}
}
