package com.vc.redistemplatetest;

import java.io.Serializable;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@Disabled
//@SpringBootTest
public class RedisTemplateTest
{

	@Autowired
	private RedisTemplate redisTemplate;
	
	
	@Test
	void testSendMail()
	{
		redisTemplate.opsForValue().set("email","vicky1413@gmail.com");
		
		Object mail = redisTemplate.opsForValue().get("salary");
		int a=1;
		}
	
	
	
	
	
}
