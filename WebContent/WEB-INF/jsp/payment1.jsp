 <script type="text/javascript">
var pid='<%=request.getAttribute("productId")%>';
//alert(pid);
$.ajax({
    type : "POST",
    dataType : "json",
    async : true,
    cache : false,
    global : false,
    url : "prodata.htm",
    data: "productId="+pid,
    success: function(row){
	$('#productId').val(row[0].productId);
	$('#productSize').val(row[0].productSize);
	$('#productPrice').val(row[0].productPrice);
    },
    error : function(xhr, e) {

    }

});

</script>

<div class="container">
<br></br>
<div class="row">
<div class="col-sm-2 col-md-2 col-lg-2">
<a class="btn btn-block btn-info" href="javascript:showpage('shopping')">Back</a>
</div>
<div class="col-sm-2 col-md-2 col-lg-2 col-sm-offset-8">
<a class="btn btn-block btn-info" href="javascript:showpage('login')">Logout</a>
</div>
</div>
       <div class="text-center">        
                    <h2 style="color: #4e4e4e">Open Payment</h2>
                </div> 
                <br><br>
                <div class="row contact-wrap labeltxt"> 
                    <div class="col-sm-9 col-sm-offset-2 ">
                       
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Product_id: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   id="productId" name="productId"  required="required" disabled>
                                
                            </div>
                        </div>
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Price: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"  id="productPrice" name="productPrice"  required="required" disabled>
                                
                            </div>
                        </div>
                        
                          <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Size: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   id="productSize" name="productSize"  required="required"disabled>
                                
                            </div>
                        </div>
                        
                        
                        
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               Name: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   placeholder="Name" id="userName" name="userName"  required="required">
                                
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                               CVV : <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   placeholder="CVV" id="cvvNumber" name="cvvNumber"  required="required">
                                
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                                Date of Expiry (month/year): <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   placeholder="Expiry Date" id="expiryDate12" name="expiryDate12"  required="required">
                                
                            </div>
                        </div>

                       <div class="row">
                            <div class="col-sm-3 col-sm-offset-0" align='left'style="color: black">
                                Address: <font color="red"><sup>*</sup></font><font color="black"> :</font><br>
                            </div>
                            <div class="col-sm-5 form-group">
                                <input type="text" class="focus form-control"   placeholder="Address" id="address" name="address"  required="required">
                                
                            </div>
                        </div>
                        <br>
                        <div class="col-sm-offset-2">
                        <input type="submit" id="buttsub" style="min-width:13%;" class="btn btn-primary btn-lg" onclick="payment('payment.htm','pay')" value="Order">
                        </div> 
                        <br></br>
                    </div>
                </div>
        </div>
        