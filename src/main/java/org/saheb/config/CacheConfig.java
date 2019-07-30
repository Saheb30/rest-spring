package org.saheb.config;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
public class CacheConfig {
	@Bean
	public CacheManager cacheManager() {
		CaffeineCache caffeineCache = new CaffeineCache("cmsCache", Caffeine.newBuilder()
				.expireAfterWrite(Long.MAX_VALUE, TimeUnit.HOURS)
				  .maximumSize(500)
				  .build());
		SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
		simpleCacheManager.setCaches(Arrays.asList(caffeineCache));
		return simpleCacheManager;
	}
	
}
