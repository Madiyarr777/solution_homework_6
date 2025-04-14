package chainofresponsibility;


public class TechSupportDemo {
    public static void main(String[] args) {

        SupportHandler faqBot = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faqBot.setNext(junior).setNext(senior);

        String[] incomingIssues = {
                "password_reset",
                "refund_request",
                "account_ban",
                "unknown_bug"
        };

        for (String issue : incomingIssues) {
            try {
                System.out.println("\n--- Новый запрос: \"" + issue + "\" ---");
                faqBot.handle(issue);
            } catch (UnhandledIssueException e) {
                System.out.println("Запрос \"" + e.getIssue() + "\" не решён. Эскалировать проблему на ручное рассмотрение.");
            }
        }
    }
}
