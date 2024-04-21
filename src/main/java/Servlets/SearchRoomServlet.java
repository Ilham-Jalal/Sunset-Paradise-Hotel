package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RoomDao;
import MySQL.RoomDaoImpl;
import model.Room;

@WebServlet("/SearchRoomServlet")
public class SearchRoomServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RoomDao roomDAO;

    public void init() {
        roomDAO = new RoomDaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roomType = request.getParameter("roomType");

        List<Room> rooms = roomDAO.searchRoom(roomType);

        request.setAttribute("rooms", rooms);

        request.getRequestDispatcher("search_results.jsp").forward(request, response);
    }
}
