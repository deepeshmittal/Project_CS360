<!DOCTYPE HTML>
<!--
	Telephasic by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Register Case</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script type="text/javascript">
	
	function loadUser() {
		var user = `<%= Session["patient"] %>`;
		var firstNameField = getElementById("fName");
		firstNameField.setValue("user.firstName");
		
	}
	
	</script>
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
						<h1 id="logo"><a href="patient-home.html">Home</a></h1>

					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li>
									<a href="">Patient Portal</a>
									<ul>
										<li><a href="register-case.html">Register New Case</a></li>
										<li><a href="patient-case-history.html">Case History</a></li>
									</ul>
								</li>
								<li class="break"><a href="about-us.html">About US</a></li>
								<li class="break"><a href="contact-us.html">Contact Us</a></li>
								<li>
									<a href="">User Name</a>
									<ul>
										<li><a href="#">My Profile</a></li>
										<li><a href="#">Change Password</a></li>
										<li><a href="index.html">logout</a></li>
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
								<h2>Register Case</h2>
								<p>Please provide details about your medical condition :</p>
							</header>
							<section class="6u 12u(narrower)">
							<form method="post" action="#">
								<div class="row 50%">
									<div class="12u">
										<input name="fname" id="fname" placeholder="First Name" type="text" value='<%=request.getAttribute("fname")%>'/><br>
										<input name="lname" placeholder="Last Name" type="text" /><br>
										<select>
											<option value='' disabled selected>Please select your disease</option>
											<option value="chicken pox">Chicken Pox</option>
											<option value="cold sores">Cold Sores</option>
											<option value="common cold">Common Cold</option>
											<option value="cough">Cough</option>
											<option value= "Arthritis"> Arthritis </option>
											<option value= "Asthma"> Asthma </option>
											<option value= "Diabetes"> Diabetes </option>
											<option value= "Epilepsy"> Epilepsy </option>
											<option value= "Stroke"> Stroke </option>
											<option value= "Headache"> Headache </option>
											<option value= "Nausea"> Nausea </option>
											<option value= "Fever"> Fever </option>
											<option value= "Body Pain"> Body Pain </option>
											<option value= "Backache"> backache </option>
											<option value= "Stomach Pain"> stomach pain </option>			
										</select><br />
										<select>
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