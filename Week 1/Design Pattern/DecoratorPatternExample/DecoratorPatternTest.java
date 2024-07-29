public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();
        
        // Create a notifier with both Email and SMS functionality
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

         // Send notifications using the decorated notifiers
         smsEmailNotifier.send("Hello World!");
        
    }
}
