package com.yash.parkingallocationsystem.services.serviceimpl;


import com.yash.parkingallocationsystem.model.Booking;
import com.yash.parkingallocationsystem.services.service.BookingService;

import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Override
    public void addBooking(Booking booking) {

    }

    @Override
    public Booking getBookingById(int id) {
        return null;
    }

    @Override
    public List<Booking> getAllBookings() {
        List<Booking> bookings = new java.util.ArrayList<>();
        return bookings;
    }

    @Override
    public void updateBooking(Booking booking) {

    }

    @Override
    public void removeBooking(int id) {

    }
}
