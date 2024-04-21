package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ochotel.Beans.DataBase;

import DAO.ReservationDao;
import model.Reservation;

public class ReservationDaoImpl implements ReservationDao {
    @Override
    public List<Reservation> getReservations() throws ClassNotFoundException, SQLException {
        List<Reservation> reservations = new ArrayList<>();
        String sql = "SELECT * FROM reservations";
        try (Connection connection = DataBase.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int reservationId = resultSet.getInt("reservation_id");
                int roomId = resultSet.getInt("room_id");
                Date startDate = resultSet.getDate("start_date");
                Date endDate = resultSet.getDate("end_date");
                int numGuests = resultSet.getInt("user_id");
                Reservation reservation = new Reservation(reservationId, roomId, startDate, endDate, numGuests);
                reservations.add(reservation);
            }
        }
        return reservations;
    }

    @Override
    public void createReservation(Reservation reservation) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO reservations (room_id, start_date, end_date, user_id) VALUES (?, ?, ?, ?)";
        try (Connection connection = DataBase.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservation.getRoomId());
            statement.setDate(2, new java.sql.Date(reservation.getStartDate().getTime()));
            statement.setDate(3, new java.sql.Date(reservation.getEndDate().getTime()));
            statement.setString(4, reservation.getUserId());
            statement.executeUpdate();
        }
    }


    @Override
    public void cancelReservation(int reservationId) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM reservations WHERE reservation_id = ?";
        try (Connection connection = DataBase.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservationId);
            statement.executeUpdate();
        }
    }
}
