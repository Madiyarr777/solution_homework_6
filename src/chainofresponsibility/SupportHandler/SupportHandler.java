package chainofresponsibility;


public abstract class SupportHandler {
    protected SupportHandler next;


    public SupportHandler setNext(SupportHandler nextHandler) {
        this.next = nextHandler;
        return nextHandler;
    }



    public void handle(String issue) throws UnhandledIssueException {
        System.out.println(this.getClass().getSimpleName() + " получил запрос: \"" + issue + "\"");
        if (canHandle(issue)) {
            System.out.println(this.getClass().getSimpleName() + " обработал запрос \"" + issue + "\"");
        } else if (next != null) {
            System.out.println(this.getClass().getSimpleName() + " не смог обработать \"" + issue + "\", перенаправление на следующий уровень...");
            next.handle(issue);
        } else {
            throw new UnhandledIssueException(issue);
        }
    }


    protected abstract boolean canHandle(String issue);
}
