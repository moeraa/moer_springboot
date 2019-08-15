package com.moer.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: moer
 * @Date: 2019/8/14 17:07
 * @Description:
 */
@Configuration
@EnableConfigurationProperties(HelloPropertites.class)
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

  @Autowired
  HelloPropertites helloPropertites;

  @Bean
  HelloService helloService() {
    HelloService helloService = new HelloService();
    helloService.setName(helloPropertites.getName());
    helloService.setMsg(helloPropertites.getMsg());
    return helloService;
  }
}
