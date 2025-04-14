package chainofresponsibility;


public class FAQBotHandler extends SupportHandler {
    @Override
    protected boolean canHandle(String issue) {
        return issue.equals("password_reset");
    }
}
