package com.wisely.highlight_spring4.chl.di;

import org.springframework.stereotype.Service;

/**
 * 使用@Service注解声明当前FunctionService是一个Spring管理的bean。
 */
@Service
public class FunctionService
{
    public String sayHello(String word){
        return "Hello " + word + "! ";
    }
}
