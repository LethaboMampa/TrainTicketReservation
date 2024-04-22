package Repository;

import Entity.PaymentTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTransactionRepo extends JpaRepository<PaymentTransaction, Long> {

}
