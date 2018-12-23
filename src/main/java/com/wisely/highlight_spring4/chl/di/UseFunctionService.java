package com.wisely.highlight_spring4.chl.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//声明为spring管理的一个bean
@Service
public class UseFunctionService
{
    @Autowired
//  使用这个注解将FunctionService的实体Bean注入到UseFunctionService中。
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
