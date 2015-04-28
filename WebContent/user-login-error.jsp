<!DOCTYPE HTML>
<html>
	<head>
		<title>Login !!</title>
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
								<h2 style="text-align:center">Login</h2>
								<p style="text-align:center">Please login with your registered Email ID with us.</p>
								<p style="text-align:center; color:red; font-size:20px">Email ID and Password doesn't match. Try again !!</p>
							</header>
							<section class="6u 12u(narrower)">
							<form method="post" action="/newproject_360/login">
								<div class="row 50%">
									<div style="margin-left: 50%" class="12u">
										<input name="email" placeholder="Registered Email ID" id="email" type="text" />
									</div>
									<div style="margin-left: 50%" class="12u">
										<input name="password" placeholder="Password" id="password" type="password" />
									</div>
								</div>
								<div class="row 50%">
									<div style="margin-left: 50%" class="12u">
										<ul class="actions">
											<li><input type="submit" value="Login" /></li>
											<li><input type="reset" value="Reset" /></li>
										</ul>
									</div>
								</div>
							</form>
						</section>
						<a style="float:right" href="new-user.jsp">New User ? Sign up</a>
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