<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: lightblue;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        #dashboard {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        #userPhoto {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            object-fit: cover;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div id="dashboard">
        <img id="userPhoto" src="templates/images/icons/favicon.ico" alt="User Photo">
        <h2 id="userName">John Doe</h2>
        <p id="userEmail">john.doe@example.com</p>
        <p id="contactName">Emergency Contact: Jane Doe</p>
    </div>

    <script>
        // You can use JavaScript to dynamically update the content if needed
        // For example:
        //// document.getElementById('userName').innerText = 'New Name';
        // document.getElementById('userEmail').innerText = 'new.email@example.com';
        // document.getElementById('contactName').innerText = 'New Contact: Another Name';
    </script>
</body>
</html>
