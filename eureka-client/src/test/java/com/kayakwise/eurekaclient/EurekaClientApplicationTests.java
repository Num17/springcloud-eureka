package com.kayakwise.eurekaclient;

import com.netflix.discovery.converters.Auto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.lang.Nullable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = EurekaClientApplicationTests.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class EurekaClientApplicationTests {

    private String email;

    @Test
    public void contextLoads() {

        String s = testNullable(null);
        System.out.println(s);
    }

    private String testNullable(@Nullable String name) {
        System.out.println(name.equals("name"));
        return name;
    }

    @Test
    public void test1() {
        Person person = new Man();

        person.setName("zhangjialu");
        ((Man) person).setEmail("2540705109@qq.com");

        System.out.println(person);

    }

}
