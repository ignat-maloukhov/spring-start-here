package demo.ignat.proxy.impl;

import demo.ignat.model.Comment;
import demo.ignat.proxy.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("PUSH")
public class PushCommentNotification implements CommentNotificationProxy {
    @Override
    public void sent(Comment comment) {
        System.out.println("Comment \"" + comment.getText() + "\" sent by push");
    }
}
