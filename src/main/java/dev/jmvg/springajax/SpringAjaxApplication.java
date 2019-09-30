package dev.jmvg.springajax;

import dev.jmvg.springajax.domain.SocialMetaTag;
import dev.jmvg.springajax.service.SocialMetaTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAjaxApplication implements CommandLineRunner {
    @Autowired
    public SpringAjaxApplication(SocialMetaTagService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAjaxApplication.class, args);
    }

    private SocialMetaTagService service;

    @Override
    public void run(String... args) {
        SocialMetaTag og = service.getSocialMetaTagByUrl("https://www.udemy.com/spring-boot-mvc-com-ajax");
        System.out.println(og.toString());
    }
}
