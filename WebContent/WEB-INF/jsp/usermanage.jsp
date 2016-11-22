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
	
		<form id="formValid" class="contact-form"  name="contact-form">
                <div class="text-center">        
                    <h2 style="color: #4e4e4e">Maintain FanZone</h2>
                </div> 
                <br><br>
                <div class="row contact-wrap labeltxt"> 
                    <div class="col-sm-12 col-sm-offset-2 ">
                       <input type="hidden" class="focus form-control"   placeholder="First Name" id="userId" name="userId" style="width: 100%;" required="required" >
                                
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               First Name: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="First Name" id="firstName" name="firstName" style="width: 100%;" required="required" >
                                
                            </div>
                        </div>
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Last Name: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="Last Name" id="lastName" name="lastName"  required="required">
                                
                            </div>
                        </div>
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Age : <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="Age" id="age" name="age"  required="required">
                                
                            </div>
                        </div>
                        
                        
                        
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Address : <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="Address" id="address" name="address"  required="required">
                                
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                                Phone NO : <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control" id="phoneNO" name="phoneNO"  required="required" placeholder="Phone">
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                                Email Id: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"  id="emailId" name="emailId"  required="required" placeholder="Email Id" >
                                
                            </div>
                        </div>
                        <br>
                        <div class="col-sm-offset-2">        
                            <button class="btn btn-primary btn-lg" type="button" onclick="userRegistation('user.htm', 'userAddAdmin')">Add As New</button>
                            <button class="btn btn-primary btn-lg" type="button" required="required" style="min-width:25%;" onclick="editeUser('user.htm', 'editByAdmin')">Edit</button>
                           
                        </div> 
                    </div>
                </div>
            </form>
	
      <table data-toggle="table"
       data-height="400"
       data-url="usrdata.htm"
       data-search="true">
    <thead>
    <tr>
    	<th data-field="userId">Id</th>
        <th data-field="firstName">First Name</th>
        <th data-field="lastName">Last Name</th>
        <th data-field="age">Age</th>
        <th data-field="address">Address</th>
        <th data-field="phoneNO">Phone No</th>
        <th data-field="emailId">email Address</th>
        <th data-field="action" data-formatter="actionFormatter" data-events="actionEvents">Action</th>
    </tr>
    </thead>
    </table>
   </div>
<script>
function actionFormatter(value, row, index) {
    return [
         '<a class="edit btn btn-primary" href="javascript:void(0)" title="Edit">',
        '<i class="glyphicon glyphicon-edit"></i>',
        '</a>','<a> </a>',
        '<a class="remove btn btn-danger" href="javascript:void(0)" title="Remove">',
        '<i class="glyphicon glyphicon-remove"></i>',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .edit': function (e, value, row, index) {
        //alert('You click edit icon, row: ' + row.name);
        $('#userId').val(row.userId);
		$('#firstName').val(row.firstName);
		$('#lastName').val(row.lastName);
		$('#age').val(row.age);
		$('#address').val(row.address);
		$('#phoneNO').val(row.phoneNO);
		$('#emailId').val(row.emailId);
    },
    'click .remove': function (e, value, row, index) {
    	var userId = row.userId;
        var firstName = row.firstName;
        var lastName = row.lastName;
        var phoneNO = row.phoneNO;
        var age = row.age;
        var address = row.address;
        var emailId =row.emailId;
       // var password = $("#password").val();
       var param ="&userId="+userId+ "&firstName=" + firstName + "&lastName=" + lastName + "&emailId=" + emailId + "&phoneNO=" + phoneNO + "&age=" + age + "&address=" + address + "&oparation=userDelete";
       //alert(param);
       myajax(param,'user.htm');
    }
};
</script>
    </body>
</html>