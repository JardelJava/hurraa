<%@ include file="top.jsp" %>
<%-- @ include file="nav.jsp" --%>

<section id="forms">
    <form class="form-signin" action="Login.mtw" method="post">
        <h2 class="form-signin-heading">&nbsp;Hurraa&nbsp;!<span>Opensource help desk service management</span></h2>
    <input type="text" id="email" name="email" class="input-block-level" placeholder="Email" >
    <input type="password" id="senha" name="senha" class="input-block-level" placeholder="Senha">
    <span class="logo"><a href="http://www.cejug.org/" target="_blank" title="The Cear&aacute; Java User Group"><img src="img/logo_cejug.png" alt="CEJUG"></a></span>
    <button id="signin" class="btn btn-primary" type="submit">Entrar</button>
  </form>
</section>
<script>
document.getElementById("email").focus();
</script>
<%@ include file="bottom.jsp" %>