package Service;

import Entity.PaymentTransaction;

import java.util.List;

public interface PaymentTransactionService {
    PaymentTransaction createPaymentTransaction(PaymentTransaction paymentTransaction);
    PaymentTransaction updatePaymentTransaction(PaymentTransaction paymentTransaction);
    void deletePaymentTransaction(Long paymentTransactionId);
    PaymentTransaction getPaymentTransactionById(Long paymentTransactionId);
    List<PaymentTransaction> getAllPaymentTransactions();
}
