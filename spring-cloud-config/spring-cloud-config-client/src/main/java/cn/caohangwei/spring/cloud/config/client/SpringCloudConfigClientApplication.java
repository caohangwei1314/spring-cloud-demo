package cn.caohangwei.spring.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringCloudConfigClientApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringCloudConfigClientApplication.class,args);
    }
}
