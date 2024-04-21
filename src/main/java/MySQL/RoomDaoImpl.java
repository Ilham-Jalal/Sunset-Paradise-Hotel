package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ochotel.Beans.DataBase;

import DAO.RoomDao;
import model.Room;

public class RoomDaoImpl implements RoomDao {

	@Override
	public List<Room> showRoom() throws ClassNotFoundException, SQLException{
	    List<Room> rooms = new ArrayList<>();
	    String sql = "SELECT * FROM rooms";

	    try (Connection connection = DataBase.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql);
	         ResultSet resultSet = statement.executeQuery()) {

	        while (resultSet.next()) {
	            int roomId = resultSet.getInt("room_id");
	            String roomType = resultSet.getString("room_type");
	            double price = resultSet.getDouble("price");
	            String amenities = resultSet.getString("amenities");
	            boolean available = resultSet.getBoolean("available");

	            Room room = new Room(roomId, roomType, price, amenities, available);
	            rooms.add(room);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

	    return rooms;
	}


	@Override
	public List<Room> searchRoom(String searchTerm) throws ClassNotFoundException, SQLException{
	    List<Room> rooms = new ArrayList<>();
	    String sql = "SELECT * FROM room WHERE type LIKE ?";
	    try {
	        Connection connection = DataBase.getConnection();
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setString(1, "%" + searchTerm + "%");
	        ResultSet resultSet = statement.executeQuery();
	        while (resultSet.next()) {
	            Room room = new Room(
	                    resultSet.getInt("id"),
	                    resultSet.getString("type"),
	                    resultSet.getDouble("prix"),
	                    resultSet.getString("équipements"),
	                    resultSet.getBoolean("disponibilité")
	            );
	            rooms.add(room);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	    return rooms;
	}



}
