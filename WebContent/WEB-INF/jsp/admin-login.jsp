<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <style>
            body {
                padding-top: 90px;
            }
            .panel-login {
                border-color: #ccc;
                box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);
            }
            .panel-login>.panel-heading {
                color: #00415d;
                background-color: #fff;
                border-color: #fff;
                text-align:center;
            }
            .panel-login>.panel-heading a{
                text-decoration: none;
                color: #666;
                font-weight: bold;
                font-size: 15px;
                transition: all 0.1s linear;
            }
          
            .panel-login>.panel-heading hr{
                margin-top: 10px;
                margin-bottom: 0px;
                clear: both;
                border: 0;
                height: 1px;

            }
            .panel-login input[type="text"] {
                height: 45px;
                border: 1px solid #ddd;
                font-size: 16px;

                transition: all 0.1s linear;
            }

            .btn-login {
                background-color: #59B2E0;
                outline: none;
                color: #fff;
                font-size: 14px;
                height: auto;
                font-weight: normal;
                padding: 14px 0;
                text-transform: uppercase;
                border-color: #59B2E6;
            }
            
            .forgot-password {
                text-decoration: underline;
                color: #888;
            }
            .forgot-password:hover,
            .forgot-password:focus {
                text-decoration: underline;
                color: #666;
            }

            .btn-register {
                background-color: #1CB94E;
                outline: none;
                color: #fff;
                font-size: 14px;
                height: auto;
                font-weight: normal;
                padding: 14px 0;
                text-transform: uppercase;
                border-color: #1CB94A;
            }
           
        </style>
    </head>
    <body style="background-color:floralwhite">
      
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel panel-login">
                        <div class="panel-heading">
                            <div class="row">
                                <h1>Login</h1>
                                
                            </div>
                            <hr>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="" method="post" role="form" style="display: block;">
                                        <div class="input-group">
                                            <div class="input-group-addon"><i class="fa fa-users" aria-hidden="true"></i></div>
                                            <input type="text" class="form-control" placeholder="Username">
                                        </div>
                                        <br>
                                        <div class="input-group">
                                            <div class="input-group-addon"><i class="fa fa-unlock" aria-hidden="true"></i></div>
                                            <input type="text"   class="form-control" placeholder="password">
                                        </div>
                                        <br>    
                                         
                                        
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="" id="login-submit"  class="form-control btn btn-login" value="Log In">
                                                </div>
                                            </div>
                                        </div>
                                        
                                    </form>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </body>
</html>