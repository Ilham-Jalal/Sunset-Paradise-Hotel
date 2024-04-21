package DAO;

import model.Reservation;
import java.sql.SQLException;
import java.util.List;

public interface ReservationDao {
    List<Reservation> getReservations() throws ClassNotFoundException, SQLException;
    void createReservation(Reservation reservation) throws ClassNotFoundException, SQLException;
    void cancelReservation(int reservationId) throws ClassNotFoundException, SQLException;
}
