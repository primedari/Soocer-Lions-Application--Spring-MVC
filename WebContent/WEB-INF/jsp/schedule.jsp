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
                    <h2 style="color: #4e4e4e">Maintain Team Schedule</h2>
                </div> 
                <br><br>
                 <input type="hidden" class="focus form-control"   placeholder="" id="scheduleId" name="scheduleId"  required="required" >                              
                <div class="row contact-wrap labeltxt"> 
                    <div class="col-sm-12 col-sm-offset-2 ">
                       
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Schedule Between: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                            <select class="form-control" id="scheduleBetween" name="scheduleBetween">
                                <option value="" style="background-color: darkgrey;">Select Schedule Between</option>
                                <option value="Team1VSTeam2">Team1VSTeam2</option>
                                <option value="Team1VSTeam3">Team1VSTeam3</option>
                                <option value="Team1VSTeam4">Team1VSTeam4</option>
                                <option value="Team2VSTeam3">Team2VSTeam3</option>
                                <option value="Team2VSTeam4">Team2VSTeam4</option>
                                <option value="Team3VSTeam4">Team3VSTeam4</option>
                                
                            </select>
                            </div>
                        </div>
                        
                         
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Date : <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="" id="date" name="date"  required="required">
                                
                            </div>
                        </div>
                        
                        
                        
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               place: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="place" id="place" name="place"  required="required">
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               price: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-4 form-group">
                                <input type="text" class="focus form-control"   placeholder="price" id="price" name="price"  required="required">
                                
                            </div>
                        </div>
                        <div class="col-sm-offset-2">        
                            <button type="reset" name="reset" class="btn btn-primary btn-lg" required="required" style="min-width:25%;" onclick="schedule('schdul.htm', 'add')">Schedule</button>
                           <button type="reset" name="reset" class="btn btn-primary btn-lg" required="required" style="min-width:25%;" onclick="editSchedule('schdul.htm', 'edit')">Edit</button>
                           
                        </div> 
                    </div>
                </div>
            </form>
	
      <table data-toggle="table"
       data-height="800"
       data-url="data.htm"
       data-search="true">
    <thead>
    <tr>
    	<th data-field="scheduleId">Id</th>
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
         '<a class="edit btn btn-primary" href="javascript:void(0)" title="Edit">',
        '<i class="glyphicon glyphicon-edit"></i>',
        '</a>','<a> </a>',
        '<a class="remove btn btn-danger" href="javascript:void(0)" title="Remove">',
        '<i class="glyphicon glyphicon-remove"></i>',
        '</a>',
    ].join('');
}

window.actionEvents = {
    'click .edit': function (e, value, row, index) {
        //alert('You click edit icon, row: ' + row.name);
		$('#scheduleId').val(row.scheduleId);
		$('#scheduleBetween').val(row.scheduleBetween);
		$('#date').val(row.date);
		$('#place').val(row.place);
		$('#price').val(row.price);
		$('$Address').val(row.place);
    },
    'click .remove': function (e, value, row, index) {
    	var scheduleId=row.scheduleId;
    	alert(scheduleId);
    	var scheduleBetween =row.scheduleBetween;
        var place =row.place;
        var date = row.date;
        var param = "scheduleId="+scheduleId+"&scheduleBetween=" + scheduleBetween +  "&date=" + date +"&place=" + place +"&operation=delete";
    	
    	myajax(param,'schdul.htm');
    }
};
</script>
    </body>
</html>