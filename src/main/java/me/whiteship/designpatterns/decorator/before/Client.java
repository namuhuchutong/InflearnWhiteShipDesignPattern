package me.whiteship.designpatterns.decorator.before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("hello");
        client.writeComment("asdfjklasdfj...");
        client.writeComment("http://adsfadf.com");
    }

}