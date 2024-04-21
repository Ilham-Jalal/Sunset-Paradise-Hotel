package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ReservationDao;
import MySQL.ReservationDaoImpl;

@WebServlet("/CancelReservationServlet")
public class CancelReservationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ReservationDao reservationDAO;

    public void init() {
        reservationDAO = new ReservationDaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int reservationId = Integer.parseInt(request.getParameter("reservationId"));
        reservationDAO.cancelReservation(reservationId);
        response.sendRedirect(request.getContextPath() + "/ReservationServlet");
    }
}
