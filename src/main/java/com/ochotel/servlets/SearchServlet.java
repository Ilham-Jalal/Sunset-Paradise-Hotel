package com.ochotel.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ochotel.Beans.Room;
import com.ochotel.dao.RoomDao;
import com.ochotel.dao.RoomDaoImpl;




@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RoomDao roomDAO;

    public void init() {
        roomDAO = new RoomDaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roomType = request.getParameter("roomType");

        List<Room> rooms = roomDAO.searchRoom(type);

        request.setAttribute("rooms", rooms);

        request.getRequestDispatcher("Search.jsp").forward(request, response);
    }
}