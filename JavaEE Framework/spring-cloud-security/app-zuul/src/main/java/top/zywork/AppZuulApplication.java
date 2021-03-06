package top.zywork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AppZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppZuulApplication.class, args);
    }
}
