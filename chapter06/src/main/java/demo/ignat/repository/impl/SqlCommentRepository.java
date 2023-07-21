package demo.ignat.repository.impl;

import demo.ignat.model.Comment;
import demo.ignat.repository.CommentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SqlCommentRepository implements CommentRepository {

    @Override
    public void save(Comment comment) {
        System.out.println("Comment \"" + comment.getText() + "\" saved");
    }
}
