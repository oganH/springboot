package cn.com.springboot;

import cn.com.springboot.entity.Demo;
import cn.com.springboot.mapper.DemoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Autowired
    private DemoMapper demoMapper;

    @Test
    public void contextLoads() {
        Demo demo = new Demo();
        demo.setName("demo");
        demoMapper.insert(demo);
    }

}
