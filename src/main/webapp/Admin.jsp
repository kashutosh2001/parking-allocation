<!-- <!DOCTYPE html> -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  body
   {
    color: blue;
  }
  
  #form 
  {
  	display:inline-block;
  	margin-top:20%;
  	margin-left:30%;
  	color: black;
    border: 1px solid black;
    padding: 10px;
  }
  
  input[type="text"], input[type="number"] 
  {
  	margin:10px;
    color: green;
  }
  
  button[type="submit"] 
  {
    background-color:black;
    color:white;
    
  }
</style>
</head>
<body>
<div id="form">
 <form action="user" method="post"> 
Enter name<input type="text" name="name">
Enter id<input type="text" name="id"><br>
Enter email<input type="text" name="email"><br>
<button type="submit">submit</button>
</form>
</div>
</body>
</html>