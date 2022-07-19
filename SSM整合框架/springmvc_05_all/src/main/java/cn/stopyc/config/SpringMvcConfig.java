package cn.stopyc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @program: springmvc_demo02
 * @description:
 * @author: stop.yc
 * @create: 2022-07-19 11:41
 **/
//3. 创建springmvc的配置文件,加载controller对应的bean
@Configuration
@ComponentScan({"cn.stopyc.controller","cn.stopyc.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
