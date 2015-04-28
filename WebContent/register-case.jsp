<!DOCTYPE HTML>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Register Case</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<body class="no-sidebar">

		<!-- Header -->
			<div id="header-wrapper">
				<div id="header" class="container">

					<!-- Logo -->
						<h1 id="logo"><a href="patient-home.jsp">Home</a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li>
									<a href="">Patient Portal</a>
									<ul>
										<li><a href="register-case.jsp">Register New Case</a></li>
										<li><a href='<c:url value="/caseHistory"/>'>Case History</a></li>									</ul>
								</li>
										<li class="break"><a href="patient-about-us.jsp">About US</a></li>
										<li class="break"><a href="patient-contact-us.jsp">Contact Us</a></li>
										<li class="break"><a href="<c:url value="/logout"/>">logout</a></li>	
							</ul>
						</nav>

				</div>
			</div>

		<!-- Main -->
			<div class="wrapper">
				<div class="container" id="main">

					<!-- Content -->
						<article id="content">
							<header>
								<h2>Register Case</h2>
								<p>Please provide details about your medical condition :</p>
							</header>
							<section class="6u 12u(narrower)">
							<form method="post" action="/newproject_360/register">
								<div class="row 50%">
									<div class="12u">
										<input name="fname" id="fname" placeholder="First Name" type="text" value="${user.firstName}" readonly/><br>
										<input name="lname" placeholder="Last Name" type="text" value="${user.lastName}" readonly/><br>
										<select name="disease" id="disease" required>
											<option value='' disabled selected>Please select your disease</option>
											<option value="pain">Pain</option>
											<option value="drowsiness">Drowsiness</option>
											<option value="nausea">Nausea</option>
											<option value="anxiety">Anxiety</option>
											<option value= "depression">Depression</option>			
										</select><br />
										<select name="severity" id="severity" required>
											<option value='' disabled selected>Enter severity level [0-10]</option>
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
											<option value="10">10</option>
										</select><br />
										
										<div class="row 50%">
											<div class="12u">
												<p>Additional Comments :</p>
												<textarea name="message" placeholder="Describe your illness (Optional)" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Describe your illness (Optional)'"></textarea>
											</div>
										</div>
									</div>
								</div>
								<div class="row 50%">
									<div style="margin-left: 75%" class="12u">
										<ul class="actions">
											<li><input type="submit" value ="Submit"/></li>
											<li><input type="reset" value="Reset" /></li>
										</ul>
									</div>
								</div>
							</form>
						</section>

						</article>

					</div>
				</div>

		<!-- Footer -->
			<div id="footer-wrapper">
				<div id="copyright" class="container">
					<ul class="menu">
						<li>Copyright &copy; 2015 Team Minions. All rights reserved.</li><li>Designed by: Team Minions</li>
					</ul>
				</div>
			</div>

	</body>
</html>