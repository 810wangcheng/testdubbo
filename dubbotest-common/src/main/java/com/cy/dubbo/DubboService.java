package com.cy.dubbo;

/**
 * @author Administrator
 */
public interface DubboService {

    /**
     * 说一些事情
     * @param name
     * @return
     */
    String saySomething(String name);

    /**
     * 吃一些事物
     * @param food
     * @return
     */
    String eat(String food);

    /**
     * 喝一些饮料
     * @param drink
     * @return
     */
    String drink(String drink);

}