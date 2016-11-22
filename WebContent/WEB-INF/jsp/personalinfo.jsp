<div class="col-sm-2 col-md-2 col-lg-2">
<a class="btn btn-block btn-info" href="javascript:showpage('userHome')">Back</a>
</div>
<div class="col-sm-2 col-md-2 col-lg-2 col-sm-offset-8">
<a class="btn btn-block btn-info" href="javascript:showpage('login')">Logout</a>
</div>

<script type="text/javascript">

$.ajax({
    type : "POST",
    dataType : "json",
    async : true,
    cache : false,
    global : false,
    url : "user.htm",
    data : 'oparation=fetch',
    success: function(row){
	$('#userId').append(row[0].userId);
	$('#firstName1').append(row[0].firstName);
	$('#lastName1').append(row[0].lastName);
	$('#age1').append(row[0].age);
	$('#address1').append(row[0].address);
	$('#phone1').append(row[0].phoneNO);
	$('#email1').append(row[0].emailId);  
	setValues(row);  
    },
    error : function(xhr, e) {

    }

});
function setValues(row){
	$('#userId').val(row[0].userId);
	$('#firstName').val(row[0].firstName);
	$('#lastName').val(row[0].lastName);
	$('#age').val(row[0].age);
	$('#address').val(row[0].address);
	$('#phoneNO').val(row[0].phoneNO);
	$('#emailId').val(row[0].emailId);  
}
</script>

<div>
<form id="formValid" class="contact-form"  name="contact-form">
                <div class="text-center">        
                </div> 
                <br><br>
                <div class="row contact-wrap labeltxt"> 
                    <div class="col-sm-12 col-sm-offset-2 ">
                                
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               First Name: 
                               </div>
                            <div class="col-sm-4 form-group" id="firstName1">
                                
                            </div>
                        </div>
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Last Name: 
                               </div>
                            <div class="col-sm-4 form-group" id="lastName1">
                            </div>
                        </div>
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Age :
                               </div>
                            <div class="col-sm-4 form-group" id="age1">
                            </div>
                        </div>
                        
                        
                        
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Address : 
                               </div>
                            <div class="col-sm-4 form-group" id="address1">
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                                Phone NO :
                                </div>
                            <div class="col-sm-4 form-group" id="phone1">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                                Email Id:
                                
                              </div>
                            <div class="col-sm-4 form-group" id="email1">
                            </div>
                        </div>
                        <br> 
                    </div>
                </div>
            </form>
</div>
<button type="button"  class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal" >Edit</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
        <form id="formValid" class="contact-form"  name="contact-form">
         <div class="row contact-wrap labeltxt">
         			 <input type="hidden" class="focus form-control"   placeholder="First Name" id="userId" name="userId" style="width: 100%;" required="required" >
                                
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
                                <input type="text" class="focus form-control"  id="emailId" name="emailId"  required="required" placeholder="Email Id" disabled>
                                
                            </div>
                        </div>
                        <br>
                        <div class="col-sm-offset-2">        
                          <button class="btn btn-primary btn-lg" type="button" onclick="editeByUser('user.htm', 'editByUser')">Edit</button>       
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