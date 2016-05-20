package cn.wangdanhua.restapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "cn.wangdanhua.restapi.controller", "cn.wangdanhua.restapi.service"})
public class AppConfig {

}
