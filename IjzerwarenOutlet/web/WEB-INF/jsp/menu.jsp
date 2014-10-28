
                <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/stylesheet.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="WEB-INF/js/bootstrap.js"></script>

        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp"><img alt="IJzerwarenOutlet" width="95px" height="40px" src="img/logo.jpg"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
          
          <!-- Producten begin -->
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Producten<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">Balken</a></li>
            <li><a href="#">Schroeven</a></li>
            <li><a href="#">Gereedschap</a></li>
            <li class="divider"></li>
            <li><a href="#">Test</a></li>
            <li class="divider"></li>
            <li><a href="#">Test 2</a></li>
          </ul>
        </li> 
        <!-- Producten eind -->
        
        <!-- Stiho groep start -->
                <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">STIHO Groep<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="http://www.stiho.nl/">Stiho</a></li>
            <li><a href="http://www.giebels.nl/">Giebels</a></li>
            <li><a href="http://www.baars-bloemhoff.nl/">Baars & Bloemhoff</a></li>
            <li><a href="http://www.bouwmaat.nl/">Bouwmaat</a></li>
          </ul>
        </li>
        <!-- Stiho groep eind -->
        
        <li><a href="about_us.jsp">Over ons</a></li>
        <li><a href="contact.jsp">Contact</a></li>
      </ul>
       
      <!-- Account begin-->
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Account <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="login.jsp">Inloggen</a></li>
            <li><a href="register.jsp">Registreren</a></li>
          </ul>
        </li>
      </ul>
      <!--Account eind-->
        
        <!-- Zoekbalk begin -->
        <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Zoeken">
        </div>
        <button type="submit" class="btn btn-success">Zoek</button>
      </form>
        <!-- Zoekbalk eind-->
        
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>