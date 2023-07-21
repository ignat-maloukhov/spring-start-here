package demo.ignat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"demo.ignat.proxy", "demo.ignat.repository", "demo.ignat.service"})
public class Config {
}
