package com.ochotel.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ochotel.dao.ReservationDaoImpl;
import com.ochotel.dao.RoomDaoImpl;


@WebServlet("/Hoteel")
public class Hoteel extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Hoteel() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RoomDaoImpl roompl =new RoomDaoImpl();
	    ReservationDaoImpl reservation = new ReservationDaoImpl();
			try {
				request.setAttribute("rooms", roompl.displayRoom());
				request.setAttribute("reservation", reservation.getUserReservations());
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.getServletContext().getRequestDispatcher("/WEB-INF/hotel.jsp").forward(request, response);
	
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
