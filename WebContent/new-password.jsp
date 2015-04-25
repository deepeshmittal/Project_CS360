<!DOCTYPE HTML>
<html>
	<head>
		<title>Reset Password</title>
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
			<link rel="stylesheet" href="css/skel.css"/>
			<link rel="stylesheet" href="css/style.css"/>
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<body class="no-sidebar">

		<!-- Header -->
			<div id="header-wrapper">
				<div id="header" class="container">

					<!-- Logo -->
						<img id="image_logo" src="images/Minion_Logo.jpg">
						<h1 id="logo"><a href="index.jsp">Home</a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li class="break"><a href="about-us.jsp">About US</a></li>
								<li class="break"><a href="contact-us.jsp">Contact Us</a></li>
								<li class="break"><a href="user-login.jsp">Login</a></li>
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
								<h2 style="text-align:center">Set New Password</h2>
							</header>
							<section class="6u 12u(narrower)">
							<form method="post" action="/newproject_360/login">
								<div class="row 50%">
									<div style="margin-left: 50%" class="12u">
										<input name="newpassword" placeholder="Enter 8 digit password" id="newpassword" type="password" />
									</div>
								</div>
								<div class="row 50%">
									<div style="margin-left: 50%" class="12u">
										<ul class="actions">
											<li><input type="submit" value="Submit" /></li>
											<li><input type="reset" value="Reset" /></li>
										</ul>
									</div>
								</div>
							</form>
						</section>
						</article>

					</div>
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