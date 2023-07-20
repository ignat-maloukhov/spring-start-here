package demo.ignat.proxy;

import demo.ignat.model.Comment;

public interface CommentNotificationProxy {

    void sent(Comment comment);

}
