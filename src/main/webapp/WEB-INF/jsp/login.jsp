<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>EmployeeAsset</title>
</head>
<body>
	<header id="home" class="header">
		<nav class="nav" role="navigation">
        <div class="container nav-elements">
            <div class="branding">
                <a href="#home"><img src="images/assetmanagement.svg" alt="Logo - Employee Assets"></a>
            </div><!-- branding -->
            <ul class="navbar">
					<li><a href="#">home</a></li>
					<li><a href="#">search</a></li>
					<li><a href="#">linkedIn</a></li>
            </ul><!-- navbar -->
        </div><!-- container nav-elements -->
    </nav>
	
		
	</header>
	<!-- #home -->
    <span class="success">${dataSaved}</span>
   	<section id="login" class="section">
		<div class="container tagline">
			<em>LOGIN USER</em><br/>
			
			 <form:form method="post" action="/home1" modelAttribute="newuser">
    			<label>Username</label> <form:input id="txtUserName" path="txtUserName" type="text" /><br/>
    			<label>Password</label> <form:input id="txtPassword" path="txtPassword" type="password" /><br/>
    			<input type="submit" value="Submit" id="btnSignin">
    		</form:form>
			 <a class="card-title" href="/goToRegistration">Register new user? Click here</a>
		</div>
	</section>
	
	
	<!-- #products -->


	<footer class="footer">
    <div class="container">
        <nav class="nav" role="navigation">
            <div class="container nav-elements">
                <div class="branding">
                    <a href="#home"><img src="images/assetmanagement.svg" alt="Logo - Employee Assets"></a>
                    <p class="address">1001 moon<br>
                        Earth, Milkyway Galaxy, eastwest 98345
                    </p>
                </div>
            </div>
        </nav>
        <p class="legal">Asset management solely for the purpose of training. All products and people associated with Asset management are also fictitious. Any resemblance to real brands, products, or people is purely coincidental. Information provided about the product is also fictitious and should not be construed to be representative of actual products on the market in a similar product category.</p>
    </div><!-- container -->
</footer><!-- footer -->

</body>
</html>