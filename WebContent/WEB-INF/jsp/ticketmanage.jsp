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
       data-url="tktdata.htm"
       data-search="true">
    <thead>
    <tr>
    	<th data-field="ticketId">Id</th>
        <th data-field="firstName">First Name</th>
        <th data-field="lastName">Last Name</th>
        <th data-field="phone">Phone Number</th>
        <th data-field="emailId">Email Id</th>
        <th data-field="Address">Address</th>
        <th data-field="ticketCount">Ticket</th>
        <th data-field="action" data-formatter="actionFormatter" data-events="actionEvents">Action</th>
    </tr>
    </thead>
    </table>
   <div>
<script>
function actionFormatter(value, row, index) {
    return [
        '<a class="remove btn btn-danger" href="javascript:void(0)" title="Remove">',
        'Cancel Ticket',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .remove': function (e, value, row, index) {
	var ticketId = row.ticketId;
	alert(ticketId);
	var firstName = row.firstName;
    var lastName = row.lastName;
     var phone = row.phone;
     var Address =row.Address;
      var emailId = row;
      var status ="true";
   var param ="ticketId="+ticketId+"&firstName=" + firstName + "&lastName=" + lastName + "&emailId=" + emailId  + "&phone=" + phone +"&status="+status+ "&Address=" + Address +"&operation=delete";
   alert(param);
   myajax(param,'ticket.htm');
    }
};
</script>
    </body>
</html>