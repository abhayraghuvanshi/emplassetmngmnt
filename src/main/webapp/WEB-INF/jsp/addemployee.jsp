<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>EmployeeAsset</title>
	<link rel="stylesheet" href="/css/style.css"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
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




	<section id="registration" class="section">
	 <div class="container tagline">
	 <em>Add employee</em><br/>
    		 <form:form method="post" action="/insertaddemployee" modelAttribute="newEmployee">
    			<label>txtEmployeeID</label> <form:input id="txtEmployeeID" path="txtEmployeeID" type="text" /><br/>
    			<label>txtSurname</label> <form:input id="txtSurname" path="txtSurname" type="text" /><br/>
    			<label>txtName</label> <form:input id="txtName" path="txtName" type="text" /><br/>
    			<label>txtMobile</label> <form:input id="txtMobile" path="txtMobile" type="text" /><br/>
    			<label>txtLocation</label> <form:input id="txtLocation" path="txtLocation" type="text" /><br/>
    			<label>txtDesignation</label> <form:input id="txtDesignation" path="txtDesignation" type="text" /><br/>
    			<input type="submit" value="Submit" id="btnSignin">
    		</form:form>
		</div>
	</section>
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