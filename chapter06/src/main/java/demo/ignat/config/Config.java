package demo.ignat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = {"demo.ignat.service", "demo.ignat.aspect"})
@EnableAspectJAutoProxy
public class Config {
}
