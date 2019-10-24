package com.ha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.core.io.Resource;
import com.ha.config.ErrorConfig;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopApplicationTests {
	
	@Autowired
	ErrorConfig config;

	@Test
	public void contextLoads() {
		System.out.println(config.toString());
	}
}
