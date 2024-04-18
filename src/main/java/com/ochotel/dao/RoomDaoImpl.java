package com.ochotel.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ochotel.Beans.DataBase;
import com.ochotel.Beans.Room;

public class RoomDaoImpl implements RoomDao{

	@Override
	
		
		  public List<Room> addRoom() throws ClassNotFoundException, SQLException{
		         List<Room> room=new ArrayList<Room>();
		            String requet = "SELECT * FROM room";
		            PreparedStatement statement = DataBase.getConnection().prepareStatement(requet);
		            ResultSet resultat = statement.executeQuery();

		            while (resultat.next()) {
		                int id = resultat.getInt("id");
		                String type= resultat.getString("type");
		                int prix  = resultat.getInt("prix");
		                String equipement= resultat.getString("équipements");
		                Boolean disponibilite=resultat.getBoolean("disponibilité");
		               

		                Room Room = new Room(id, type,prix,equipement,disponibilite );

		                room.add(Room);
		            }
		            System.out.print(room.get(0).getId());
		            
		            
		            return room;
		    }
	}

