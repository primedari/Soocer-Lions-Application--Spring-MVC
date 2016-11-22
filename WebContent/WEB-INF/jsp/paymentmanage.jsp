<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.js"></script>

    </head>
    <body>
    <div class="container">
<br></br>
<div class="row">
<div class="col-sm-2 col-md-2 col-lg-2">
<a class="btn btn-block btn-info" href="javascript:showpage('dash')">Back</a>
</div>
<div class="col-sm-2 col-md-2 col-lg-2 col-sm-offset-8">
<a class="btn btn-block btn-info" href="">Logout</a>
</div>
</div>
</div>
	<div class="container">
      <table data-toggle="table"
       data-height="400"
       data-url="paydata.htm"
       data-search="true">
    <thead>
    <tr>
    	<th data-field="paymentId">Id</th>
        <th data-field="productId">Product Id</th>
        <th data-field="productSize">Size</th>
        <th data-field="productPrice">Price</th>
        <th data-field="userName">Name</th>
        <th data-field="address">Address</th>
        <th data-field="cvvNumber">CVV</th>
        <th data-field="expiryDate12">Expiry Date</th>
       </tr>
    </thead>
    </table>
   <div>
    </body>
</html>