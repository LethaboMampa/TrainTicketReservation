package Service;

import Entity.PaymentTransaction;
import Repository.PaymentTransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentTransactionServiceImpl implements PaymentTransactionService {

    @Autowired
    private PaymentTransactionRepo paymentTransactionRepository;

    @Override
    public PaymentTransaction createPaymentTransaction(PaymentTransaction paymentTransaction) {
        return paymentTransactionRepository.save(paymentTransaction);
    }

    @Override
    public PaymentTransaction updatePaymentTransaction(PaymentTransaction paymentTransaction) {
        return paymentTransactionRepository.save(paymentTransaction);
    }

    @Override
    public void deletePaymentTransaction(Long paymentTransactionId) {
        paymentTransactionRepository.deleteById(paymentTransactionId);
    }

    @Override
    public PaymentTransaction getPaymentTransactionById(Long paymentTransactionId) {
        return paymentTransactionRepository.findById(paymentTransactionId).orElse(null);
    }

    @Override
    public List<PaymentTransaction> getAllPaymentTransactions() {
        return paymentTransactionRepository.findAll();
    }
}
