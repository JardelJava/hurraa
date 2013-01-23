<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>

<section id="navbar">
  <div class="navbar">
    <div class="navbar-inner">
      <div class="container" style="width: auto;">
        <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </a>
        <img class="pull-left" src="img/48x.png" width="40px" height="40px" style="margin-right: 10px; margin-top: 5px">
        <a class="brand" href="#">Hurraa !</a>

        <div class="nav-collapse">
          <ul class="nav">
            <li class="active"><a href="#">In�cio</a></li>
            <li><a href="#">Link</a></li>
            <li><a href="#">Link</a></li>
            <li><a href="#">Link</a></li>
            <li class="dropdown">

              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Action</a></li>
                <li><a href="#">Another action</a></li>
                <li><a href="#">Something else here</a></li>
                <li class="divider"></li>
                <li><a href="#">Separated link</a></li>

              </ul>
            </li>
          </ul>
          <form class="navbar-search pull-left" action="">
            <input type="text" class="search-query span2" placeholder="Search">
          </form>
          <ul class="nav pull-right">

            <li class="divider-vertical"></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">${sessionUser}<b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#">Perfil</a></li>
                <li class="divider"></li>
                <li><a href="Logout.mtw">Sair</a></li>
              </ul>
            </li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div>
    </div><!-- /navbar-inner -->
  </div><!-- /navbar -->

</section>

