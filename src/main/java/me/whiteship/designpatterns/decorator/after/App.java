package me.whiteship.designpatterns.decorator.after;


public class App {

    private static boolean enableSpamFilter = true;

    private static boolean enableTrimming = true;

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();

        if (enableSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enableTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("hello");
        client.writeComment("asdfjklasdfj...");
        client.writeComment("http://adsfadf.com");
    }
}
