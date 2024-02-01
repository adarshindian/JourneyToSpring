<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="templates/css/util.css">
<link rel="stylesheet" type="text/css" href="templates/css/main.css">
</head>
<body>


	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form action="AddCustomer" method="POST"
					class="login100-form validate-form">
					<span class="login100-form-title p-b-26"> Welcome </span> <span
						class="login100-form-title p-b-48"> <i
						class="zmdi zmdi-font"></i>
					</span>

					<div class="wrap-input100 validate-input"
						data-validate="Enter First Name">
						<input class="input100" type="text" name="fname"> <span
							class="focus-input100" data-placeholder="First name"></span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Enter Last Name">
						<input class="input100" type="text" name="lname"> <span
							class="focus-input100" data-placeholder="Last name"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="street"> <span
							class="focus-input100" data-placeholder="Street"></span>
					</div>

					<div class="wrap-input100 validate-input"
						data-validate="Enter Address">
						<input class="input100" type="text" name="address"> <span
							class="focus-input100" data-placeholder="Address"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="city"> <span
							class="focus-input100" data-placeholder="City"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="state"> <span
							class="focus-input100" data-placeholder="State"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="email"
							data-validate="Enter Email"> <span class="focus-input100"
							data-placeholder="Email"></span>
					</div>

					<div class="wrap-input100 validate-input">
						<input class="input100" type="text" name="phone"
							data-validate="Enter Phone"> <span class="focus-input100"
							data-placeholder="Phone"></span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Enter pass">
						<input class="input100" type="password" name="pass"> <span
							class="focus-input100" data-placeholder="Password"></span>
					</div>



					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Login</button>
						</div>
					</div>

					<div class="text-center p-t-115">
						<span class="txt1"> Don’t have an account? </span> <a class="txt2"
							href="#"> Sign Up </a>
					</div>
				</form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="templates/js/main.js"></script>



</body>
</html>