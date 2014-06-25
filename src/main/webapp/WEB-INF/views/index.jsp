<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Shorten URL Web</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="LittleSparkVT">

<!-- Style sheets -->
<link href="../css/bootstrap.css" rel="stylesheet">
<link href="../css/bootstrap-responsive.css" rel="stylesheet">
<link href="../css/font-awesome.css" rel="stylesheet">
<link href="../css/m-forms.min.css" rel="stylesheet">
<link href="../css/m-buttons.css" rel="stylesheet">
<link href="../css/custom.css" rel="stylesheet">

<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300'
	rel='stylesheet' type='text/css'>


<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->

<!-- fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="ico/apple-touch-icon-57-precomposed.png">
</head>

<body>
	<div id="wrap">
		<!-- HEADER CONTAINER -->
		<div class="row header" style="text-align: center; padding-top: 5%">
			<span style="font-size: 38px; font-weight: bold"><span
				style="color: rgb(0, 153, 0)">Shorten URL Web</span><br />
			<br /> <span style="font-size: 30px"><span id="result">${error}</span></span>
		</div>



		<!-- Start Callout -->

		<div class="full callout" style="text-align: center">

			<!-- Start Carousel -->


			<input type="text" class="form-control" name="searchBox" id="url"
				placeholder="URL" style="width: 60%; margin: 0px"></br>
			<button type="button" class="btn btn-success" id="submit"
				style="margin-top: 10px;">Submit</button>
			<!-- Start Features -->
			<div class="row features" id="result"
				style="margin-top: 5px; margin-bottom: 20px"></div>
		</div>
		<!-- FOOTER -->
		<div></div>
	</div>
	<div class="container" style="text-align: center">


		<div class="container footer" style="margin: 0px;">

			<!-- Copyright and contact -->

			<div class="span4 address"></div>

			<!-- Social media buttons -->

			<div class="span8 hidden-phone">

				<ul class="footerlinks" style="margin: 0px">
					<li><a href="http://www.twitter.com/whycheckshirts"
						target="_blank"><i class="icon-twitter-sign icon-large"></i></a></li>
					<li><a href="http://www.twitter.com/whycheckshirts"
						target="_blank"><i class="icon-facebook-sign icon-large"></i></a></li>
					<li><a href="http://www.twitter.com/whycheckshirts"
						target="_blank"><i class="icon-google-plus-sign icon-large"></i></a></li>
				</ul>

			</div>

		</div>

	</div>
	<!-- Javascripts -->
	<script src="../js/index/index.js" type="text/slowscript">  </script>
	<script src="../js/require.min.js" data-main="../js/entry.js" async></script>
</body>

</html>
