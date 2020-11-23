package com.cy.dubbo;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author Administrator
 */
@Service(timeout = 3000)
public class DubboServiceImpl implements DubboService {

    @Override
    public String saySomething(String name) {
        System.out.println(name+"进入此方法");
        return name+"通过dubbo接口说：我已经进来了";
    }

    @Override
    public String eat(String food) {
        System.out.println("food为"+food);
        return "很饿了，来点"+food;
    }

    @Override
    public String drink(String drink) {
        System.out.println("drink:"+drink);
        return "别噎着了，喝点"+drink;
    }
}