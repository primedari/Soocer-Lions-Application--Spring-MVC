<br></br>
<div class="container login-page">
 <form id="formValid" class="contact-form" name="contact-form" method="post">
                <div class="row contact-wrap labeltxt"> 
                    <!--<div class="status alert alert-success" style="display: none"></div>-->

                    <div class="col-sm-5 col-sm-offset-1"> 
                        <div class="form-group">
                            <label><font color="#4e4e4e">First Name</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label>
                            <input type="text" id="firstName" name="firstName" class="form-control"  required="required"/>

                        </div>
                        <div class="form-group">
                            <label><font color="#4e4e4e">Last Name</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label>
                            <input type="text" id="lastName" name="lastName" class="form-control"  required="required"/>
                        </div>
						<div class="form-group">
                            <label><font color="#4e4e4e">Age</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label>
                            <input type="text" id="age" name="age" class="form-control"  required="required"/>
                        </div>
                        <div class="form-group">
                            <label><font color="#4e4e4e">Email Id</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label>
                            <input type="email" id="emailId" name="emailId" class="form-control"  required="required"/>
                            <span id="emailspan" value="0"></span>
                        </div>
                        <div class="form-group">
                            <label><font color="#4e4e4e">Password</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label><!--<font color="green">&nbsp;&nbsp;(/([a-z])/([A-Z])/([0-9])/([!,%,&,@,#,$,^,*,?,_,~]))</font>-->
                            <input type="password" id="password" name="password" class="form-control"  required="required"/>
                           
                        </div>
                    </div>
                    <div class="col-sm-5">
                        <div class="form-group">
                            <label><font color="#4e4e4e">Address</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label>
                            <input type="text" id="address" name="address" class="form-control"  required="required"/>
                        </div>
                        
                        <div class="form-group">
                            <label><font color="#4e4e4e">Phone Number</font><font color="red"><sup>*</sup></font><font color="#4e4e4e"> :</font></label>
                            <input type="text" id="phoneNO" name="phoneNO" class="form-control"  required="required" onkeyup="this.value = this.value.replace(/[^0-9]/g, '');">
                        </div>
                    </div>

                </div><!--/.row-->
                <div class="center"><br>
                    <input type="submit" id="buttsub" style="min-width:13%;" class="btn btn-primary btn-lg" value="Submit">
                    <button type="reset" id="resetButton" name="reset" style="min-width:13%;" class="btn btn-primary btn-lg">Reset</button> 
                </div> 
            </form>
</div>
<div><br></br></div>
<script>
$(document).ready(function () {
    $("#formValid").validate({
        rules: {
            "firstName": {
                required: true
            },
            "lastName": {
                required: true
            },
			 "age": {
                required: true
            },
            "emailId": {
                required: true,
                email: true
            },
            "pass": {
                required: true,
                minlength: 6,
                maxlength: 15
            },
            "address": {
                required: true,
                maxlength: 100
            },
            "phoneNO": {
                required: true,
                digits: true,
                minlength: 10,
                maxlength: 10
            }
        },
        submitHandler: function (form) {
           userRegistation('user.htm', 'reg');
        }
    });
});

</script>


