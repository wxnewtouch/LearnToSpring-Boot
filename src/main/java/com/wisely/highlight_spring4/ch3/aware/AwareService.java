package com.wisely.highlight_spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        Resource reasource =
                loader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.txt");
        try{
            System.out.println("ResourceLoader加载的文件为： "+
                    IOUtils.toString(reasource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
