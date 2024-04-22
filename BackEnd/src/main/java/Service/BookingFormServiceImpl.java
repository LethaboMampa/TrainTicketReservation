package Service;

import Entity.BookingForm;
import Repository.BookingFormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingFormServiceImpl implements BookingFormService {

    @Autowired
    private BookingFormRepo bookingFormRepository;

    @Override
    public BookingForm createBookingForm(BookingForm bookingForm) {
        return bookingFormRepository.save(bookingForm);
    }

    @Override
    public BookingForm updateBookingForm(BookingForm bookingForm) {
        return bookingFormRepository.save(bookingForm);
    }

    @Override
    public void deleteBookingForm(Long bookingFormId) {
        bookingFormRepository.deleteById(bookingFormId);
    }

    @Override
    public BookingForm getBookingFormById(Long bookingFormId) {
        return bookingFormRepository.findById(bookingFormId).orElse(null);
    }

    @Override
    public List<BookingForm> getAllBookingForms() {
        return bookingFormRepository.findAll();
    }
}
