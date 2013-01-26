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
        <a class="brand" href="${pageContext.request.contextPath}">Hurraa !</a>

        <div class="nav-collapse">
          <ul class="nav">

            <li class="active"><a href="${pageContext.request.contextPath}">Início</a></li>

            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Administração <b class="caret"></b></a>
              <ul class="dropdown-menu">

                <li><a href="#">Usuários</a></li>

                <li class="dropdown-submenu">
                   <a href="Hurraa.inventario.mtw" tabindex="-1">Inventário</a>
                   <ul class="dropdown-menu">
                     <li><a href="Fabricantes.mtw" tabindex="-1">Fabricantes</a></li>
                   </ul>
                </li>

              </ul>
            </li>
          </ul>

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

        </div>

      </div>
    </div>
  </div>

</section>

