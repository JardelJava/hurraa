<%--
   Hurraa http://github.com/heliofrota/hurraa/

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
<%@ include file="top.jsp"%>
<section id="forms">
	<form class="form-signin" action="Login.mtw" method="post"
		autocomplete="off">
		<h2 class="form-signin-heading">
			&nbsp;Hurraa&nbsp;!<span>Opensource help desk service
				management<br>Built under license GPLv3
			</span>
		</h2>
		<input id="user" type="text" name="email" class="input-block-level"
			placeholder="Email" /> <span id="user-icon"></span> <input
			type="password" id="password" name="senha" class="input-block-level"
			placeholder="Senha" /> <span id="pswd-icon"></span>
		<button id="signin" class="btn btn-primary" type="submit">Entrar</button>		
	</form>
	<div class="logo">
			<img src="http://i.creativecommons.org/l/by-sa/3.0/88x31.png" alt="Creative Commons License"/><br />
				Oxygen Icons is licensed under a<br/> <a class="license"
				rel="license" href="http://creativecommons.org/licenses/by-sa/3.0/">
				Creative Commons Attribution-ShareAlike 3.0 Unported License.</a>
				<a class="license" href="https://github.com/logos">GitHub logotype is a trademark of GitHub Inc.</a>
		</div>
</section>

<style>
.pull-right {
	display: none;
}
</style>
<%@ include file="bottom.jsp"%>
