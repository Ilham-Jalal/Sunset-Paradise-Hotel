<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Your Reservations</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
        <style>
        body {
            background-color: #DA70D6;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }
        ul.navbar {
            list-style-type: none;
            padding: 0;
            margin: 0;
            background-color: #333;
            overflow: hidden;
        }

        ul.navbar li {
            float: left;
        }

        ul.navbar li a {
            display: flex;
            flex-derection:row;
            color: #fff;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        ul.navbar li a:hover {
            background-color: #555;
        }

        h1 {
            background-color: rgba(100, 192, 203, 0.42);
            text-align: center;
            color: #fff;
            margin: 0;
            padding: 20px 0;
        }

        h2 {
            color: #fff;
            text-align: center;
            margin-top: 20px;
        }

        table {
            width: 100%;
            margin-top: 20px;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #fff;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #555;
        }

        tr:hover {
            background-color: #777;
        }

        a {
            color: #fff;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        
        <nav>
            <ul class="navbar">
                <li><a href="http://localhost:8080/Paradise_hotell/RoomServlet">Home</a></li>
                <li><a href="http://localhost:8080/Paradise_hotell/ReservationServlet">Our Reservations</a></li>
                <li><a href="http://localhost:8080/Paradise_hotell/add_reservation.jsp">Add Reservation</a></li>
                <li><a href="http://localhost:8080/Paradise_hotell/SearchRoomServlet">Search Room</a></li>
            </ul>
        </nav>
        <h1>Welcome to Sunset Paradise Hotel</h1>
    </div>
    <h2>La Liste Des Reservations</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>User ID</th>
            <th>Room ID</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>action</th>
        </tr>
      <c:forEach var="reservation" items="${reservations}">
      <tr>
        <td>${reservation.getId()}</td>
        <td>${reservation.getUserId()}</td>
        <td>${reservation.getRoomId()}</td>
        <td>${reservation.getStartDate()}</td>
        <td>${reservation.getEndDate()}</td>
        <td><a href="CancelReservationServlet?reservationId=${reservation.id}">Cancel</a></td>
      </tr>
      </c:forEach>

    </table>
</body>
</html>
