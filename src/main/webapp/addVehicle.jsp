<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>Add Vehicle</title>
    <style>

      body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
      }


      .container {
        max-width: 800px;
        margin: 40px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      }


      h2 {
        color: #3498db;
        font-size: 36px;
        margin-bottom: 20px;
        text-align: center;
      }

      /* Style the form elements */
      label {
        display: block;
        margin-bottom: 10px;
      }

      input[type="text"], input[type="number"], select {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
      }

      input[type="submit"] {
        background-color: #3498db;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
      }

      input[type="submit"]:hover {
        background-color: #2980b9;
      }


      @media only screen and (max-width: 600px) {
        .container {
          margin: 20px auto;
          padding: 10px;
        }
        h2 {
          font-size: 24px;
        }
      }

      @media only screen and (max-width: 400px) {
        .container {
          margin: 10px auto;
          padding: 5px;
        }
        h2 {
          font-size: 18px;
        }
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h2>Add Vehicle</h2>

      <form action="addVehicle" method="post">
        <input type="hidden" name="action" value="add">

        <label for="vehicleType">Vehicle Type:</label>
        <select name="vehicleType" id="vehicleType">
          <option>Select Type</option>
          <option value="2 Wheeler">2 Wheeler</option>
          <option value="4 Wheeler">4 Wheeler</option>
        </select>
        <br><br>

        <label for="vehicleNumber">Vehicle Number:</label>
        <input type="text" id="vehicleNumber" name="vehicleNumber" required><br><br>

        <label for="userId">User ID:</label>
        <input type="number" id="userId" name="userId" required><br><br>

        <input type="submit" value="Add Vehicle">
      </form>
    </div>
  </body>
</html>