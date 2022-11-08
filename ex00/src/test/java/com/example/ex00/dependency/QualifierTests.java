package com.example.ex00.dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.ex00.dependency.qualifier.Computer;
import com.example.ex00.dependency.qualifier.Outback;
import com.example.ex00.dependency.qualifier.Restaurant;
import com.example.ex00.dependency.qualifier.Vips;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //파일을 참조해서 단위테스트 돌아갈수 있게 한는 것
@Log4j
public class QualifierTests {
	
//	@Autowired
//	@Qualifier("desktop")
//	private Computer desktop;
	
	@Autowired
	private Restaurant rs;
	
	@Test
	public void testQualifier() {
//		log.info("=============");
//		log.info("computer :" + desktop);
//		log.info("해상도!! : " + desktop.getScreenWidth());
//		log.info("=============");
		
		
		log.info(rs.hassalad());
		log.info(Outback.steak);
		log.info(Vips.steak);
	}
	
	
}
