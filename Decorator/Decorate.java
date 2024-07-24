package Design_Patterns.Decorator;

public class Decorate {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Print out this document");

        notifier = new SMSNotifier();
        notifier.send("Rs.100 Debited from your bank acount.");

        notifier = new InstagramReels();
        notifier.send("Reel by idk_bruh");

        notifier = new InstagramChat();
        notifier.send("Yo! Check this out!");
    }
}
