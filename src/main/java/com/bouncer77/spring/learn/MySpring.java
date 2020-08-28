package com.bouncer77.spring.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 28.08.2020
 */

public class MySpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean = context.getBean("beanId", MyBean.class);

        System.out.println(myBean);

        context.close();
    }
}
