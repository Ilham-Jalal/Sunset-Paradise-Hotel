package com.ochotel.dao;

import java.sql.SQLException;
import java.util.List;

import com.ochotel.Beans.Room;

public interface RoomDao {
	List<Room> addRoom()throws ClassNotFoundException, SQLException;

}
