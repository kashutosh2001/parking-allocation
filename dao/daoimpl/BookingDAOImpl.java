package com.yash.parkingallocationsystem.dao.daoimpl;


import com.yash.parkingallocationsystem.dao.dao.BookingDAO;
import com.yash.parkingallocationsystem.model.Booking;

import java.util.List;

public class BookingDAOImpl implements BookingDAO {

    @Override
    public void createBooking(Booking booking) {

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
    public void deleteBooking(int id) {

    }
}
