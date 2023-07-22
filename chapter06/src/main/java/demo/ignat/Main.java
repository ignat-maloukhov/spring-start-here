package demo.ignat;

import demo.ignat.config.Config;
import demo.ignat.model.Comment;
import demo.ignat.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        var service = context.getBean(CommentService.class);

        boolean isDeleted = service.deleteComment(null);

    }
}
