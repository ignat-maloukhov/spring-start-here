package demo.ignat;

import demo.ignat.config.Config;
import demo.ignat.model.Comment;
import demo.ignat.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        var service = context.getBean(CommentService.class);
        service.publishComment(new Comment("Hello"));

    }
}
