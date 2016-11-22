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
    <body onload="">
    <br></br>
    <br>
<div class="row">
<div class="col-sm-2 col-md-2 col-lg-2">
<a class="btn btn-block btn-info" href="javascript:showpage('userHome')">Back</a>
</div>
<div class="col-sm-2 col-md-2 col-lg-2 col-sm-offset-8">
<a class="btn btn-block btn-info" href="javascript:showpage('login')">Logout</a>
</div>
</div>
	<div class="container">
	  <table data-toggle="table"
       data-height="400"
       data-url="data.htm"
       data-search="true">
    <thead>
    <tr>
        <th data-field="date">Date</th>
        <th data-field="scheduleBetween">Schedule Between</th>
        <th data-field="place">Place</th>
        <th data-field="price">price</th>
        <th data-field="action" data-formatter="actionFormatter" data-events="actionEvents">Action</th>
    </tr>
    </thead>
    </table>
   <div>
<script>
function actionFormatter(value, row, index) {
    return [
         '<a class="book btn btn-primary" href="javascript:void(0)" title="Edit">',
        ' Book Ticket ',
        '</a>','<a>  </a>',
        '<a class="view btn btn-success" href="javascript:void(0)" title="Remove">',
        ' View Ticket ',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .book': function (e, value, row, index) {
        //alert('You click edit icon, row: ' + row.name);
		//javascript:showpage('booktkt');
        //getData(row);
		//javascript:showpage('error');
		$('#myModal').modal('show');
		$('#scheduleBetween').val(row.scheduleBetween);
		$('#price').val(row.price);
		$('#inval').val(row.price);
		$('#Address').val(row.place);
        console.log(value, row, index);
    },
    'click .view': function (e, value, row, index) {
    	javascript:showpage('viewtkt');
    	//javascript:showpage('error');
        console.log(value, row, index);
    }
    
};
$("#numberOfTicket").keyup( function() {
    var searchQuery = $("#numberOfTicket").val();
    var inval = $("#inval").val();
    $('#price').val(searchQuery*inval);
});
</script>
<br></br>
<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Book Ticket -Match</h4>
        </div>
        <div class="modal-body">
          <form id="formValid" class="contact-form"  name="contact-form" method="post">
                <div class="text-center">        
                    <h2 style="color: #4e4e4e">Ticket</h2>
                </div> 
                <br><br>
                <div class="row contact-wrap labeltxt"> 
                    <div class="col-sm-9 col-sm-offset-2 ">
                        <input type="hidden" class="focus form-control"   placeholder="First Name" id="inval" name="inval" style="width: 100%;" required="required">
                              
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                              First Name: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   placeholder="First Name" id="firstName" name="firstName" style="width: 100%;" required="required">
                                
                            </div>
                        </div>
                        
                        
                        
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                            Last Name : <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   placeholder="Last Name " id="lastName" name="lastName" style="width: 100%;" required="required">
                                
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Email id: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="emailId" name="emailId" style="width: 100%;" required="required" placeholder="Email">
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Mobile Number: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"  id="phone" name="phone" style="width: 100%;" required="required" placeholder="Mobile Number">
                                
                            </div>
                        </div>

                       <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                            Match: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="scheduleBetween" name="scheduleBetween" style="width: 100%;" required="required"  placeholder="Match" disabled>
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                            price: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="price" name="price" style="width: 100%;" required="required"  placeholder="Match" disabled>
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                            Address: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="Address" name="Address" style="width: 100%;" required="required"  placeholder="Match" disabled>
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                          Number of tickets: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="numberOfTicket" name="numberOfTicket" style="width: 100%;" required="required" value="1">
                                
                            </div>
                        </div>
                                         <br>
                        <div class="col-sm-offset-2">  
                        	  <button class="btn btn-primary btn-lg" type="button" onclick="bookTicket('ticket.htm', 'add')">Book</button>      
                            <button type="reset" name="reset" class="btn btn-primary btn-lg" required="required" style="min-width:25%;">Reset</button>
                           
                        </div> 
                    </div>
                </div>
            </form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>
    </body>
</html>