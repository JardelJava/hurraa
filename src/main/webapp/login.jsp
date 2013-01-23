<%@ include file="top.jsp" %>
<%@ include file="nav.jsp" %>

<section id="forms">
  <div class="row">
    <div class="span6 offset0">
        <form class="well form-search" action="Login.mtw" method="post">
          <fieldset>
          <legend>Autenticação:</legend>
          <input type="text" name="email" id="email" class="input-small" placeholder="Email">
          <input type="password" name="senha" id="senha" class="input-small" placeholder="Senha">
          <button type="submit" class="btn">Entrar</button>
          </fieldset>
        </form>
    </div>
  </div>
</section>
<script>
document.getElementById("email").focus();
</script>
<%@ include file="bottom.jsp" %>