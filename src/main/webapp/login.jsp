<%@ include file="top.jsp"%>
<body>

<div class="container">
  <form class="form-signin">
    <h2 class="form-signin-heading">&nbsp;Hurraa !<span>Opensource help desk service management</span></h2>
    <input type="text" id="users" class="input-block-level" placeholder="Usu&aacute;rio" >
    <input type="password" id="pswd" class="input-block-level" placeholder="Senha">
    <label class="checkbox">
      <input type="checkbox" value="remember-me">
      Lembrar </label>
    <span class="logo"><a href="http://www.cejug.org/" target="_blank" title="The Ceará Java User Group"><img src="img/logo_cejug.png" alt="CEJUG"></a></span>
    <button id="signin" class="btn btn-large btn-primary" type="submit">Entrar</button>	
  </form>
</div>
<!-- /container -->

<%@ include file="bottom.jsp"%>