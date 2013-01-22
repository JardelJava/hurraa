<%@ include file="top.jsp"%>
<style>
#wpmem_reg form, #wpmem_login form, .wpcf7-form {
    background-color: whiteSmoke;
    border: 1px solid rgba(0, 0, 0, 0.05);
    border-radius: 4px 4px 4px 4px;
    box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05) inset;
    margin-bottom: 20px;
    min-height: 20px;
    padding: 19px;
}
</style>

<body>

  <div class="container" style="width: 250px">

    <div id="wpmem_login" class="tab-pane active">

      <a name="login"></a>
      <form class="form" method="post" action="Login.mtw">
        <fieldset>
          <legend>Autenticação</legend>

          <label for="username">Login:</label>
          <div class="div_text">
            <div class="input-prepend">
              <span class="add-on"><i class="icon-user"></i></span>
              <input type="text" class="username span2"  value="" id="email" name="email">
            </div>
          </div>

          <label for="password">Senha</label>
          <div class="div_text">
            <div class="input-prepend">
              <span class="add-on"><i class="icon-lock"></i></span>
              <input type="password" class="password span2" id="senha" name="senha">
            </div>

          </div>

          <div class="button_div">
             <input type="submit" class="btn btn-primary" value="Login" name="Submit">
          </div>

          <div class="clear"></div>
          <div align="right">
            <a href="">Esqueceu a senha ?</a>
          </div>
          <div class="clear"></div>
        </fieldset>
      </form>
    </div>


  </div>

  <%@ include file="bottom.jsp"%>
