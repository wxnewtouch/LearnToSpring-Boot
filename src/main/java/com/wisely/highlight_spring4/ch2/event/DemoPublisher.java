package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//注入这个用来发布事件

    public void publisher(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
