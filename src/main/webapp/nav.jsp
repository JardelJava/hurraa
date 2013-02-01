<%--
   Hurraa http://code.google.com/p/hurraa/

   This file is part of Hurraa.

   Hurraa is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   Hurraa is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
 
   You should have received a copy of the GNU General Public License
   along with Hurraa.  If not, see <http://www.gnu.org/licenses/>.
--%>
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

