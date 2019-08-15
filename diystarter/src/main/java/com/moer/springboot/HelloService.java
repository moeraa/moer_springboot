package com.moer.springboot;


/**
 * @Auther: moer
 * @Date: 2019/8/14 17:05
 * @Description:
 */
public class HelloService {

  private String msg;
  private String name;

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

  public String sayHello() {
    return name + " say " + msg + "!";
  }


}
