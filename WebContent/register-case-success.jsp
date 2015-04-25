<!DOCTYPE HTML>
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
	<body onLoad="loadUser()" class="no-sidebar">

		<!-- Header -->
			<div id="header-wrapper">
				<div id="header" class="container">

					<!-- Logo -->
						<img id="image_logo" src="images/Minion_Logo.jpg">
						<h1 id="logo"><a href="patient-home.jsp">Home</a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li>
									<a href="">Patient Portal</a>
									<ul>
										<li><a href="register-case.jsp">Register New Case</a></li>
										<li><a href="patient-case-history.jsp">Case History</a></li>
									</ul>
								</li>
								<li class="break"><a href="about-us.jsp">About US</a></li>
								<li class="break"><a href="contact-us.jsp">Contact Us</a></li>
								<li>
									<a href="">User Name</a>
									<ul>
										<li><a href="#">My Profile</a></li>
										<li><a href="#">Change Password</a></li>
										<li><a href="index.jsp">logout</a></li>
									</ul>
								</li>
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
								<h2>Your case has been registered Successfully...!!</h2>
								<p>Case # : </p>
								<p id="casenumber"></p>  
							</header>
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