package DAO;

import java.sql.SQLException;
import java.util.List;

import model.Room;

public interface RoomDao {
	
	 List<Room> showRoom()throws ClassNotFoundException, SQLException;
	 List<Room> searchRoom(String searchTerm)throws ClassNotFoundException, SQLException;
}