package com.yash.parkingallocationsystem.services.service;

import com.yash.parkingallocationsystem.model.Booking;

import java.util.List;

public interface BookingService {
    void addBooking(Booking booking);
    Booking getBookingById(int id);
    List<Booking> getAllBookings();
    void updateBooking(Booking booking);
    void removeBooking(int id);
}
