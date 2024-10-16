package com.yash.parkingallocationsystem.dao.dao;


import com.yash.parkingallocationsystem.model.Booking;

import java.util.List;

public interface BookingDAO {
    void createBooking(Booking booking);
    Booking getBookingById(int id);
    List<Booking> getAllBookings();
    void updateBooking(Booking booking);
    void deleteBooking(int id);
}
