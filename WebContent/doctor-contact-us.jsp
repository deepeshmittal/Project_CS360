<!DOCTYPE HTML>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Contact US</title>
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
						<h1 id="logo"><a href="doctor-home.jsp">Home</a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li>
									<a href="">Doctor Portal</a>
									<ul>
										<li><a href='<c:url value="/caseHistory"/>'>Patient Cases</a></li>
									</ul>
								</li>
								<li class="break"><a href="doctor-about-us.jsp">About US</a></li>
								<li class="break"><a href="doctor-contact-us.jsp">Contact Us</a></li>
								<li class="break"><a href="<c:url value="/logout"/>">logout</a></li>
							</ul>
						</nav>

				</div>
			</div>


		<!-- Footer -->
			<div id="footer-wrapper">
				<div id="footer" class="container">
					<header class="major">
						<h2>Contact Numbers</h2><br />
						<p>Mobile : (453)-689-4321<br />
						Toll free : (877)-654-3219</p>
						<br/>
						<h2>Also you can visit our office</h2><br />
						<p>XXX W First Street<br>
						Tempe Arizona US- 85281</p>  
						<h2>Or leave your feedback for us</h2>
						<br />
					</header>
					<div class="row">
						<section class="6u 12u(narrower)">
							<form method="post" action="#">
								<div class="row 50%">
									<div class="6u 12u(mobile)">
										<input name="name" placeholder="Name" type="text" />
									</div>
									<div class="6u 12u(mobile)">
										<input name="email" placeholder="Email" type="text" />
									</div>
								</div>
								<div class="row 50%">
									<div class="12u">
										<textarea name="message" placeholder="Message"></textarea>
									</div>
								</div>
								<div class="row 50%">
									<div class="12u">
										<ul class="actions">
											<li><input type="submit" value="Send Message" /></li>
											<li><input type="reset" value="Clear form" /></li>
										</ul>
									</div>
								</div>
							</form>
						</section>
						<section class="6u 12u(narrower)">
							<div class="row 0%">
								<ul class="divided icons 6u 12u(mobile)">
									<li class="icon fa-twitter"><a href="#"><span class="extra">twitter.com/</span>icare</a></li>
									<li class="icon fa-facebook"><a href="#"><span class="extra">facebook.com/</span>icare</a></li>
									<li class="icon fa-dribbble"><a href="#"><span class="extra">dribbble.com/</span>icare</a></li>
								</ul>
								<ul class="divided icons 6u 12u(mobile)">
									<li class="icon fa-instagram"><a href="#"><span class="extra">instagram.com/</span>icare</a></li>
									<li class="icon fa-youtube"><a href="#"><span class="extra">youtube.com/</span>icare</a></li>
									<li class="icon fa-pinterest"><a href="#"><span class="extra">pinterest.com/</span>icare</a></li>
								</ul>
							</div>
						</section>
					</div>
				</div>	
				</div>		
				<div id="footer-wrapper">
				<div id="copyright" class="container">
					<ul class="menu">
						<li>Copyright &copy; 2015 Team Minions. All rights reserved.</li><li>Designed by: Team Minions</li>
					</ul>
				</div>
			</div>

	</body>
</html>