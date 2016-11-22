
function myajax(parameter, controllerName) {
    alert(controllerName);
    $.ajax({
        type: "POST",
        url: controllerName,
        data: parameter,
        success: function(response) {
            if (response.toString() == "regSuccess") {
 
            	bootbox.alert("you successfully registred");
               
            }else if(response.toString() == "regSuccess")
            {
            	bootbox.alert("Please Enter Valid Email Id And Password");
            }
            else if (response.toString() === "loginFailed") {
                bootbox.alert("Please Enter Valid Email Id And Password");
            }else if(response.toString() == "loginSuccess") {
            	window.location = "userHome.htm";
            } else if(response.toString() == "loginFail") {
            	bootbox.alert("Please Enter Valid Email Id And Password");
            } else if(response.toString() == "adminloginSuccess") {
            	showpage("dash");
            } else if(response.toString() == "adminloginFail") {
            	bootbox.alert("Please Enter Valid Email Id And Password");
            } else if(response.toString() == "orderAddSuccess") {
            	bootbox.alert("your order is successfull");
            } else if(response.toString() == "orderAddFail") {
            	bootbox.alert("Somthing wrong please try again");
            } else if(response.toString() == "scheduleaddsuccess") {
            	bootbox.alert("your order is successfull");
            	showpage('schedule');
            } else if(response.toString() == "scheduleaddfalil") {
            	bootbox.alert("Somthing wrong please try again");
            } 
            else if(response.toString() == "addpaymentsuccess") {
            	bootbox.alert("your order is successfull");
            } else if(response.toString() == "addpaymentfail") {
            	bootbox.alert("Somthing wrong please try again");
            }
            else if(response.toString() == "regByAdminSuccess") {
            	bootbox.alert("successfuly add");
            	showpage('usermanage');
            } else if(response.toString() == "regByAdminFail") {
            	bootbox.alert("Somthing wrong please try again");
            }
            else if(response.toString() == "editByAdminSuccess") {
            	bootbox.alert("successfuly updated");
            	showpage('usermanage');
            } else if(response.toString() == "editByAdminFail") {
            	bootbox.alert("Somthing wrong please try again");
            }else if(response.toString() == "deleteByAdminSuccess") {
            	bootbox.alert("successfuly deleted");
            	showpage('usermanage');
            } else if(response.toString() == "deleteByAdminFail") {
            	bootbox.alert("Somthing wrong please try again");
            }
            else if(response.toString() == "schedulEditSuccess") {
            	bootbox.alert("successfuly Edited");
            	showpage('schedule');
            } else if(response.toString() == "schedulEditfail") {
            	bootbox.alert("Somthing wrong please try again");
            }
            else if(response.toString() == "schedulDeleteSuccess") {
            	bootbox.alert("successfuly Deleted");
            	showpage('schedule');
            } else if(response.toString() == "schedulDeleteFail") {
            	bootbox.alert("Somthing wrong please try again");
            }else if(response.toString() == "ticketDeleteSuccess") {
            	bootbox.alert("successfuly Deleted");
            	showpage('ticketmanage');
            } else if(response.toString() == "ticketDeleteFail") {
            	bootbox.alert("Somthing wrong please try again");
            }
            else if(response.toString() == "ticketbooksuccess") {
            	bootbox.alert("successfuly Booked");
            	showpage('ticketmanage');
            }else if(response.toString() == "ticketbookfail") {
            	bootbox.alert("something wrong please try again");
            }	
            else if(response.toString() == "editByUserSuccess") {
            	bootbox.alert("successfuly updated");
            	showpage('personalinfo');
            } else if(response.toString() == "editByUserFail") {
            	bootbox.alert("Somthing wrong please try again");
            }
        },
        error: function(e) {
        alert("===came to error part=="+e);
        }
    });
}

function adminLogin(controllerName, op) {
    var userName = $("#userName").val();
    var password = $("#password").val();
   var param = "userName=" + userName + "&password=" + password + "&operation=" + op;
   myajax(param,controllerName);
}

function userLogin(controllerName,op){

    var emailId = $("#emailId").val();
    var password = $("#password").val();
   var param = "emailId=" + emailId + "&password=" + password + "&operation=" + op;
	//alert(param);
   myajax(param,controllerName);
}

function order(controllerName,op){

    var productId = $("#productId").val();
    var size = $("#size").val();
    var price = $("#price").val();
    var name = $("#name").val();
    var cvvNo = $("#cvvNo").val();
    var expiryDate = $("#expiryDate").val();
    var address = $("#address").val();
    var param = "productId=" + productId + "&size=" + size + "&price=" + price +"&name=" + name +"&cvvNo=" + cvvNo +"&expiryDate=" + expiryDate +"&address=" + address +"&operation=" + op;
	//alert(param);
   myajax(param,controllerName);
}
function payment(controllerName,op){
	var productId=$("#productId").val();
	var productSize=$("#productSize").val();
	var productPrice=$("#productPrice").val();
	var userName=$("#userName").val();
	var cvvNumber=$("#cvvNumber").val();
	var expiryDate12=$("#expiryDate12").val();
	var address=$("#address").val();
    var param="productId="+productId+"&productSize="+productSize+"&productPrice="+productPrice+"&cvvNumber="+cvvNumber+"&expiryDate12="+expiryDate12+"&userName="+userName+"&address="+address+"&operation="+op;
	//alert(param);
    myajax(param,controllerName);
}
function schedule(controllerName,op){

    var scheduleBetween = $("#scheduleBetween").val();
    var place = $("#place").val();
    var date = $("#date").val();
    var price = $("#price").val();
    var param = "scheduleBetween=" + scheduleBetween + "&date=" + date +"&place=" + place +"&price="+price+"&operation=" + op;
	//alert(param);
    myajax(param,controllerName);
}
function editSchedule(controllerName,op){
	var scheduleId = $("#scheduleId").val();
    var scheduleBetween = $("#scheduleBetween").val();
    var place = $("#place").val();
    var date = $("#date").val();
    var price = $("#price").val();
    var param ="scheduleId="+scheduleId+"&scheduleBetween=" + scheduleBetween  + "&date=" + date +"&place=" + place +"&price="+price+"&operation=" + op;
	//alert(param);
    myajax(param,controllerName);
}
function userRegistation(controllerName,op){
    var firstName = $("#firstName").val();
    var lastName = $("#lastName").val();
     var phoneNO = $("#phoneNO").val();
     var age = $("#age").val();
     var address = $("#address").val();
      var emailId = $("#emailId").val();
    var password = $("#password").val();
   var param = "&firstName=" + firstName + "&lastName=" + lastName + "&emailId=" + emailId + "&password=" + password + "&phoneNO=" + phoneNO + "&age=" + age + "&address=" + address + "&oparation=" + op;
   //alert(param);
   myajax(param,controllerName);
}
function editeUser(controllerName,op){
	var userId = $("#userId").val();
    var firstName = $("#firstName").val();
    var lastName = $("#lastName").val();
     var phoneNO = $("#phoneNO").val();
     var age = $("#age").val();
     var address = $("#address").val();
      var emailId = $("#emailId").val();
   // var password = $("#password").val();
   var param ="&userId="+userId+ "&firstName=" + firstName + "&lastName=" + lastName + "&emailId=" + emailId + "&phoneNO=" + phoneNO + "&age=" + age + "&address=" + address + "&oparation=" + op;
   //alert(param);
   myajax(param,controllerName);
}
function editeByUser(controllerName,op){
	var userId = $("#userId").val();
    var firstName = $("#firstName").val();
    var lastName = $("#lastName").val();
     var phoneNO = $("#phoneNO").val();
     var age = $("#age").val();
     var address = $("#address").val();
      var emailId = $("#emailId").val();
   // var password = $("#password").val();
   var param ="&userId="+userId+ "&firstName=" + firstName + "&lastName=" + lastName + "&emailId=" + emailId + "&phoneNO=" + phoneNO + "&age=" + age + "&address=" + address + "&oparation=" + op;
  // alert(param);
   //alert(controllerName);
   myajax(param,controllerName);
  }
function fetchUser(controllerName,op){
	var param="oparation="+op;
	myajax(param,controllerName);
}
function bookTicket(controllerName,op){
    var firstName = $("#firstName").val();
    var lastName = $("#lastName").val();
     var phone = $("#phone").val();
     var address = $("#Address").val();
     alert("address"+address);
     
      var emailId = $("#emailId").val();
      var numberOfTicket = $("#numberOfTicket").val();
      var scheduleBetween = $("#scheduleBetween").val();
      var price = $("#price").val();
      var status ="true";
   var param = "firstName=" + firstName + "&lastName=" + lastName + "&emailId=" + emailId  + "&phone=" + phone +"&status="+status+ "&address=" + address +"&numberOfTicket="+numberOfTicket+"&scheduleBetween="+scheduleBetween+"&price="+price+"&operation=" + op;
   //alert(param);
   myajax(param,controllerName);
}
function showpage(pagename) {
    $.ajax({
        type: "GET",
        url: "page.htm",
        data: "page=" + pagename,
        success: function(response) {
            $('#center').empty().html(response);
        },
        error: function(e) {

        }
    });
}
function showpagePay(pagename,pid) {
    $.ajax({
        type: "GET",
        url: "page.htm",
        data: "page=" + pagename+"&productId="+pid,
        success: function(response) {
            $('#center').empty().html(response);
        },
        error: function(e) {

        }
    });
}
