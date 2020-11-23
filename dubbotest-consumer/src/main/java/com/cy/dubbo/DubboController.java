package com.cy.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/")
public class DubboController {

    @Reference(timeout = 3000,check = false)
    private DubboService dubboService;

    @RequestMapping("doIndex")
    @ResponseBody
    public String doIndex(){
        return "启动成功";
    }

    @RequestMapping("name")
    @ResponseBody
    public String enterName(){
        String something = dubboService.saySomething("liubeiandzhangfeiheguanyu");
        return something;
    }

    @RequestMapping("eat")
    @ResponseBody
    public String eatFood(){
        String eat = dubboService.eat("noodles,apple,banana");
        return eat;
    }

    @RequestMapping("drink")
    @ResponseBody
    public String drinkSomething(){
        String drink = dubboService.drink("water,juice");
        return drink;
    }
}
