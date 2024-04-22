package Service;

import Entity.BookingForm;

import java.util.List;

public interface BookingFormService {
    BookingForm createBookingForm(BookingForm bookingForm);
    BookingForm updateBookingForm(BookingForm bookingForm);
    void deleteBookingForm(Long bookingFormId);
    BookingForm getBookingFormById(Long bookingFormId);
    List<BookingForm> getAllBookingForms();
}
