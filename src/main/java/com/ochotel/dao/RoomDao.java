package com.ochotel.dao;

import java.sql.SQLException;
import java.util.List;

import com.ochotel.Beans.Room;

public interface RoomDao {
	List<Room> displayRoom()throws ClassNotFoundException, SQLException;
	List<Room> searchRoom(String searchTerm) throws ClassNotFoundException;
}
