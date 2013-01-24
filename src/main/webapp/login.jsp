<%@ include file="top.jsp" %>
<section id="forms">
    <form class="form-signin" action="Login.mtw" method="post">
        <h2 class="form-signin-heading">&nbsp;Hurraa&nbsp;!<span>Opensource help desk service management</span></h2>
        <input type="text" id="email" name="email" class="input-block-level" placeholder="Email" >
        <input type="password" id="senha" name="senha" class="input-block-level" placeholder="Senha">
        <button id="signin" class="btn btn-primary" type="submit">Entrar</button>
        <span class="logo">
            <a href="http://www.cejug.org/" target="_blank" title="The Cear&aacute; Java User Group">
                <img src="img/logo_cejug.svg" width="150" height="75" alt="CEJUG"></a>
        </span>
    </form>
</section>
<script>
    document.getElementById("email").focus();
</script>
<%@ include file="bottom.jsp" %>
