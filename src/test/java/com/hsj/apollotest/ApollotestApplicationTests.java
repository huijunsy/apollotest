package com.hsj.apollotest;

import com.hsj.apollotest.config.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApollotestApplicationTests {

    @Autowired
    private MyConfig myConfig;

    @Test
    public void contextLoads() {
        String node = myConfig.getNode();
        System.out.println(node);
    }

}
