package cn.caohangwei.spring.cloud.config.client.controller;

import cn.caohangwei.spring.cloud.config.client.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Demo
 * @author Administrator
 */
@RestController
public class DemoController {

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("/env")
    public String getEnv(){
        return configProperties.getEnv();
    }

    @GetMapping("/user")
    public Map<String,String> user(){
        return configProperties.getUser();
    }
}
