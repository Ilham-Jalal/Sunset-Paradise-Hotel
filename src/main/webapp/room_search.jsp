<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sunset_paradise_hotel</title>

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

        h1 {
            background-color: rgba(100, 192, 203, 0.42);
            text-align: center;
            color: #fff;
            margin: 0;
            padding: 20px 0;
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
    </style>

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
<div class="container">
    <h2>Liste des Chambres</h2>
    
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Type</th>
                <th>Prix</th>
                <th>Équipements</th>
                <th>Disponible</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="room" items="${rooms}">
                <tr>
                    <td>${room.getRoomId()}</td>
                    <td>${room.getRoomType()}</td>
                    <td>${room.getPrice()}</td>
                    <td>${room.getAmenities()}</td>
                    <td>${room.isAvailable() ? 'Oui' : 'Non'}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

