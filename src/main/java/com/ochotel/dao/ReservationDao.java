package com.ochotel.dao;

import java.sql.SQLException;
import java.util.List;

import com.ochotel.Beans.Reservation;

public interface ReservationDao {
	List<Reservation> getUserReservations() throws ClassNotFoundException, SQLException;
	void createReservation(Reservation reservation);
    void cancelReservation(int reservationId);
}
