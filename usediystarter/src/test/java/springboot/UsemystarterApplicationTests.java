package springboot;

import com.moer.springboot.HelloPropertites;
import com.moer.springboot.HelloService;
import com.moer.springboot.HelloServiceAutoConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: moer
 * @Date: 2019/8/14 17:19
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloServiceAutoConfiguration.class)
public class UsemystarterApplicationTests {

  @Autowired
  HelloService helloService;
  @Test
  public void contextLoads() {
    System.out.println(helloService.sayHello());
  }

}
