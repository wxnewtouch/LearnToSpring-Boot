package com.wisely.highlight_spring4.chl.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration声明当前类是个配置类
 * ComponementScan自动扫描包名下使用Service.Component.Repository.Controller的类，并注册为Bean
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.chl.di")
public class DiConfig
{

}
