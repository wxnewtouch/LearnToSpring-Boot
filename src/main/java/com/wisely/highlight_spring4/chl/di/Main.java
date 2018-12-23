package com.wisely.highlight_spring4.chl.di;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("helloworld"));
        context.close();
    }
}
