package com.moer.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: moer
 * @Date: 2019/8/14 16:58
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "cc")
public class HelloPropertites {

  private static final String DEFAULT_MSG = "程序媛";
  private static final String DEFAULT_NAME = "默儿";
  private String msg = DEFAULT_MSG;
  private String name = DEFAULT_NAME;

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
