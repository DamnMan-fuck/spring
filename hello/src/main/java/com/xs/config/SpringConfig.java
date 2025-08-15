package com.xs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//代替xml文件
@Configuration  // 等于xml配置文件
@ComponentScan("com.xs")  //等于<context:component-scan
public class SpringConfig {

}
