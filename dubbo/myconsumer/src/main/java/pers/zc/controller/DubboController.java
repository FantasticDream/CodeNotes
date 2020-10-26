package pers.zc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.zc.service.SayHello;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 *   @创建人  zc
 *   @创建时间 2020/10/27 1:43
 *   @包名: pers.zc.controller
 *   @描述：
 */
@RestController
@RequestMapping("/test")
public class DubboController {

//    @Resource
//    private SayHello sayHello;

    @Resource
    ApplicationContext applicationContext;

    @GetMapping("/dubbo")
    public String say() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object sayHello = applicationContext.getBean("demoService");
        Class clazz = Class.forName("pers.zc.service.SayHello");
        Method testsay = clazz.getMethod("testsay", String.class);
        String test = (String)testsay.invoke(sayHello, "test");

        return test;
    }
}
