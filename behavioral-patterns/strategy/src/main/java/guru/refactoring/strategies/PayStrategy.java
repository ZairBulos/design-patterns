package guru.refactoring.strategies;

/**
 * Strategy
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
