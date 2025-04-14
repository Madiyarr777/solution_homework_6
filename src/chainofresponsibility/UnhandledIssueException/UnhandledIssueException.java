package chainofresponsibility;


public class package chainofresponsibility;


public class UnhandledIssueException extends Exception {
    private String issue;
    public UnhandledIssueException(String issue) {
        super("Unhandled issue: " + issue);
        this.issue = issue;
    }
    public String getIssue() {
        return issue;
    }
}
extends Exception {
    private String issue;
    public UnhandledIssueException(String issue) {
        super("Unhandled issue: " + issue);
        this.issue = issue;
    }
    public String getIssue() {
        return issue;
    }
}
