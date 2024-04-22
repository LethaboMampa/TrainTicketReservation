package Repository;

import Entity.BookingForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingFormRepo extends JpaRepository<BookingForm, Long> {

}
