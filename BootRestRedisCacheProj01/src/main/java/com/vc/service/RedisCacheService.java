package com.vc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class RedisCacheService {
	
    @Autowired
	private RedisTemplate<String,Object>  redisTemplate;
    
 //   @Scheduled(cron="0/60 * * * * *")
    public void emptyCache()
    {
    	redisTemplate.delete("prods::SimpleKey[]");
    	System.out.println("deleting key prods::SimpleKey[]");
    }

}
