public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        PaymentProcessor squareProcessor = new SquareAdapter(new Square());

        // Process payments using different gateways
        paypalProcessor.processPayment(100.00);
        stripeProcessor.processPayment(200.00);
        squareProcessor.processPayment(300.00);
    }
}
