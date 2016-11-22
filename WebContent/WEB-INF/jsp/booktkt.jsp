 <br></br>

<div class="row">
<div class="col-sm-2 col-md-2 col-lg-2">
<a class="btn btn-block btn-info" href="javascript:showpage('shopping')">Back</a>
</div>
<div class="col-sm-2 col-md-2 col-lg-2 col-sm-offset-8">
<a class="btn btn-block btn-info" href="javascript:showpage('login')">Logout</a>
</div>
</div>
 <br><br>
        <div class="container">
            <form id="formValid" class="contact-form"  name="contact-form" method="post">
                <div class="text-center">        
                    <h2 style="color: #4e4e4e">Ticket</h2>
                </div> 
                <br><br>
                <div class="row contact-wrap labeltxt"> 
                    <div class="col-sm-9 col-sm-offset-2 ">
                       
                        
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
                            Address: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="address" name="address" style="width: 100%;" required="required"  placeholder="Address">
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                          Number of tickets: <font color="red"><sup>*</sup></font><font color="black"> </font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control" id="numberOfTicket" name="numberOfTicket" style="width: 100%;" required="required" value="1" disabled>
                                
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
        <br></br>
       