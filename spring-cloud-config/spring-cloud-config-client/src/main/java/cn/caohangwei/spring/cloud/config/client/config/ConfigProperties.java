package cn.caohangwei.spring.cloud.config.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "data")
public class ConfigProperties {

    private String env;

    private Map<String,String> user;
}
