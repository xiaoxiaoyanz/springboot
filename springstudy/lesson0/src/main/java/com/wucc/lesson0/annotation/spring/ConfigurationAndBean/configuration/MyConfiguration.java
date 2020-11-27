package com.wucc.lesson0.annotation.spring.ConfigurationAndBean.configuration;

import com.wucc.lesson0.annotation.spring.ConfigurationAndBean.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-27 15:43
 */

@Configuration
public class MyConfiguration {

	@Bean
	public User getUser(){
		return new User();
	}


}
