<html>
  <head>
    <style>


      body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background-color: #eaeaea;
      }


      .container {
        max-width: 800px;
        margin: 40px auto;
        padding: 20px;
        background-color: #ffffff;
        border-radius: 8px;
        box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
      }


      h2 {
        color: #2c3e50;
        font-size: 28px;
        margin-bottom: 15px;
        text-align: center;
      }


      a {
        display: inline-block;
        margin: 10px 0;
        padding: 10px 15px;
        color: #ffffff;
        background-color: #3498db;
        border-radius: 5px;
        text-decoration: none;
        transition: background-color 0.3s;
      }


      a:hover {
        background-color: #2980b9;
      }

      @media only screen and (max-width: 600px) {
        .container {
          margin: 20px auto;
          padding: 15px;
        }
        h2 {
          font-size: 22px;
        }
      }

      @media only screen and (max-width: 400px) {
        .container {
          margin: 10px auto;
          padding: 10px;
        }
        h2 {
          font-size: 18px;
        }
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h2>Parking Allocation System!</h2>
      <a href="addVehicle.jsp">Add Vehicle</a><br>
      <a href="vehicleList.jsp">Vehicle List</a><br>
    </div>
  </body>
</html>