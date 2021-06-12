<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link href="css/style.css" rel="stylesheet">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>User Registration Form</title>
</head>
<body>
	
		<div class="container">
			<div class="row centered-form">
				<div
					class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								User Edit Form
							</h3>
						</div>
						<div class="panel-body">
							<form role="form" action="http://localhost:8082/user-management-web-app/post-update" method="post">
								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="text" name="id" id="id" value="${user.id}"
												class="form-control input-sm" readonly="readonly">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="text" name="userid" id="userid" value="${user.userId}"
												class="form-control input-sm" placeholder="Enter userid">
										</div>
									</div>
								
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="text" name="username" id="username" value="${user.userName}"
												class="form-control input-sm" placeholder="Enter User Name">
										</div>
									</div>
									
								</div>

								<div class="form-group">
									<input type="email" name="email" id="email" value="${user.email}"
										class="form-control input-sm" placeholder="Enter Email Address">
								</div>

								<div class="row">
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="password" name="password" id="password" 
												class="form-control input-sm" placeholder="Password">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="password" name="confirmpassword"
												id="confirmpassword" class="form-control input-sm"
												placeholder="Confirm Password">
										</div>
									</div>
									<div class="col-xs-6 col-sm-6 col-md-6">
										<div class="form-group">
											<input type="number" name="mobile" value="${user.mobile}"
												id="mobile" class="form-control input-sm"
												placeholder="Enter Mobile Number" maxlength="10">
										</div>
									</div>
								</div>

								<input type="submit" value="Register"
									class="btn btn-info btn-block">

							</form>
						</div>
					</div>
				</div>
			</div>
		</div>



	
</body>
</html>