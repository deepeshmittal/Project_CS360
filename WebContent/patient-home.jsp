<!DOCTYPE HTML>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Home Page</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="Home Page for Patient Care Website" />
		<meta name="keywords" content="HTML CSS JAVASCRIPT" />
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
	<body class="homepage">

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

				<!-- Hero -->
					<section id="hero" class="container">
						<header>
							<h2>Welcome ${user.firstName} to Pateint Care Portal </h2>
						</header> 
						<ul class="actions">
							<li><a href="register-case.jsp" class="button">Feeling sick...Tell us !!</a></li>
						</ul>
					</section>

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