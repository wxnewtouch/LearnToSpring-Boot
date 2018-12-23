package com.wisely.highlight_spring4.chl.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.chl.aop")
@EnableAspectJAutoProxy
//此注解开启spring对aspectj的支持
public class AopConfig {
}
