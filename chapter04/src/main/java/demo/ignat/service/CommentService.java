package demo.ignat.service;

import demo.ignat.model.Comment;
import demo.ignat.proxy.CommentNotificationProxy;
import demo.ignat.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    final CommentRepository repository;
    final CommentNotificationProxy proxy;

    public CommentService(CommentRepository repository,
                          @Qualifier("PUSH") CommentNotificationProxy proxy) {
        this.repository = repository;
        this.proxy = proxy;
    }

    public void publishComment(Comment comment) {
        repository.save(comment);
        proxy.sent(comment);
    }

}
