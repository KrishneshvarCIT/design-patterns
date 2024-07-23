package Design_Patterns.Decorator;

class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("\nYou've got an Email:\n" + message);
    }
}

class SMSDecorator implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("\nSMS Received:\n" + message);
    }
}

class InstagramReels implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("\nReel received:\n" + message);
    }
}

class InstagramChat implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("\nMessage from chat:\n" + message);
    }
}
