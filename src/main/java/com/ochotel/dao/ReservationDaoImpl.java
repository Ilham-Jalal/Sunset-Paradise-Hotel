package com.ochotel.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ochotel.Beans.DataBase;
import com.ochotel.Beans.Reservation;

public class ReservationDaoImpl implements ReservationDao {


    

	@Override
	public List<Reservation> getUserReservations() throws ClassNotFoundException, SQLException {
		List<Reservation> userReservations = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DataBase.getConnection();
            String query = "SELECT * FROM réservation";
            statement = connection.prepareStatement(query);

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int reservationId = resultSet.getInt("Id");
                int roomId = resultSet.getInt("R_id");
                Date startDate = resultSet.getDate("start_date");
                Date endDate = resultSet.getDate("end_date");
                int numGuests = resultSet.getInt("num_guests");

                Reservation reservation = new Reservation(reservationId, roomId, startDate, endDate, numGuests);
                userReservations.add(reservation);
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return userReservations;
	}

	@Override
	public void createReservation(Reservation reservation) {
		
		
	}
	
	
}
