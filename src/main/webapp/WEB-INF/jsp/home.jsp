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



 <span class="success">${dataSaved}</span>
	<section id="registration" class="section">
	 <div class="container tagline">
	 <em>Asset manager Home</em><br/>
    		
    		
    		
    		<form action="/addEmployee" method="get">
              <input type="submit" name="button1" value="add Employee" />
            </form><br/>
            <form action="/viewassetList" method="get">
              <input type="submit" name="button2" value="View AssetList" />
            </form><br/>
            <form action="/addasset" method="get">
              <input type="submit" name="button3" value="add Asset" />
            </form><br/>
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