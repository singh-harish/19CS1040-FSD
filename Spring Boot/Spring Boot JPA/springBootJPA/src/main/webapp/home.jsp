<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  	
  	<a href="localhost:8080/home" class="btn btn-primary">HOME</a>
  
    <h1>INSERT / UPDATE</h1>
    <div class="contianer">
    	<form action="addAlien" method="get">
		  <div class="form-group">
		    <label >Id</label>
		    <input type="text" class="form-control" name="id" placeholder="Enter Id">
		  </div>
		  <div class="form-group">
		    <label >Name</label>
		    <input type="text" class="form-control" name="name" placeholder="Enter Name">
		  </div>
		  <div class="form-group">
		    <label >Name</label>
		    <input type="text" class="form-control" name="tech" placeholder="Enter Tech">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
    </div>
    
    <h1>GET</h1>
    <div class="contianer">
    	<form action="getAlien" method="get">
		  <div class="form-group">
		    <label >Id</label>
		    <input type="text" class="form-control" name="id" placeholder="Enter Id">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
    </div>
    
    <h1>DELETE</h1>
    <div class="contianer">
    	<form action="deleteAlien" method="get">
		  <div class="form-group">
		    <label >Id</label>
		    <input type="text" class="form-control" name="id" placeholder="Enter Id">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>