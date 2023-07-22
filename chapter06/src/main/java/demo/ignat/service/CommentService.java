package demo.ignat.service;

import demo.ignat.aspect.ToLog;
import demo.ignat.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @ToLog
    public boolean publishComment(Comment comment) {
        logger.info("Comment Service: Publishing comment " + comment.getText());
        return true;
    }

    @ToLog
    public boolean deleteComment(Comment comment) {
        logger.info("Comment Service: Deleting comment " + comment.getText());
        return true;
    }

    public boolean updateComment(Comment comment) {
        logger.info("Comment Service: Editing comment " + comment.getText());
        return true;
    }
}
