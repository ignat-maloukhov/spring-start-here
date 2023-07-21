package demo.ignat.model;

public class Comment {
    private final String text;

    public Comment(String text) {
        this.text = text;
    }

    public Comment(Comment comment) {
        this.text = comment.getText();
    }

    public Comment update(String text) {
        return new Comment(text);
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                '}';
    }

}
