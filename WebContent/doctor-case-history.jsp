<!DOCTYPE HTML>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Case History</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		
		<!-- <script type="text/javascript">
			function sendprescription() {
				var req = new XMLHttpRequest();
				
				var prescription = document.getElementById('docpres').value;
				
				var url = "/newproject_360/sendprescription";
				req.open("POST",url,false);
				req.send("pres="+prescription);
			}
		</script>  -->
	
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

		<!-- Main -->
			<div class="wrapper">
				<div class="container" id="main">

					<!-- Content -->
						<article id="content">
							<header>
								<h2>Case History</h2>
								<p>Below are the case details of your patients :</p>
							</header>
								<div class="row 50%">
									<div class="12u">
										<table>
  										  <tr>
										    <th>Case #</th>
										    <th>Patient Name</th>
										    <th>Disease</th>		
										    <th>Severity</th>
										    <th>Date Created</th>
										    <th>Resolution Date</th>
										    <th>Patient Comment</th>
										    <th>Your prescription</th>
										    <th>Calculated Severity</th>
										    <th>Status</th>
										  </tr>
										  <c:forEach var="rec" items="${caseList}">
										  <tr>
										    <td>${rec.caseNumber}</td>
										    <td>${rec.patientEmail}</td>
										    <td>${rec.disease}</td>		
										    <td>${rec.severityLevel}</td>
										    <td>${rec.dateCreated}</td>
										    <td>${rec.dateResolution}</td>
										    <td>${rec.comment}</td>
										    <td>
										    <table>
										    <tr><textarea name="docpres" id="docpres" placeholder="NA" onfocus="this.placeholder = ''" onblur="this.placeholder = 'NA'"></textarea></tr>
										    <tr><button type="submit" class="editbtn" >Send</button></tr>
										    </table>
										    </td>
										    <td>${rec.actualSeverity}</td>										    
										    <td>${rec.caseStatus}</td>
										  </tr>
										  </c:forEach>
										</table>
									</div>
								</div>

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