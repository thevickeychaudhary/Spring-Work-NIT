package com.vc.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


//@Configuration
public class RedisTemplatesConfig {

    private  RedisTemplate redisTemplate;

    RedisTemplatesConfig(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

	@Bean
	public RedisTemplate redisTemplate(RedisConnectionFactory factory)

	{
		RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(factory);

		
		// use string serilicer for keys
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		
		// use json serilizer to value 
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

		redisTemplate.afterPropertiesSet();
		return redisTemplate;

	}
	
	
	// delete all the keys by enable ttl (time to live ) 
	
	public RedisCacheManager cacheManage(LettuceConnectionFactory redisConnectionFactory)
	{
		RedisCacheConfiguration cacheConfig = RedisCacheConfiguration.defaultCacheConfig()
		.entryTtl(Duration.ofMinutes(10)) // default ttl for all cache entries
		.disableCachingNullValues();
		
		return RedisCacheManager.builder(redisConnectionFactory)
				.cacheDefaults(cacheConfig)
				.build();
				
		
	}
	
	
	

}
