<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@ include file="../../top.jsp"%>

  <%@ include file="../../nav.jsp"%>

  <div class="container" style="width: 98%;">

    <ul class="breadcrumb">
        <li><a href="${pageContext.request.contextPath}">Início</a> <span class="divider">/</span></li>
        <li><a href="Hurraa.administracao.mtw">Administração</a> <span class="divider">/</span></li>
        <li><a href="Hurraa.inventario.mtw">Inventário</a> <span class="divider">/</span></li>
        <li class="active">Fabricantes:</li>
    </ul>

    <a href="#fabricanteModal" role="button" class="btn" data-toggle="modal" style="margin-bottom: 20px;">Novo fabricante</a>

    <div id="fabricanteModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="fabricanteModalLabel" aria-hidden="true">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="fabricanteModalLabel">Fabricante:</h3>
      </div>
      <div class="modal-body">

        formulario aqui.

      </div>
      <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Cancelar</button>
        <button class="btn btn-primary">Salvar</button>
      </div>
    </div>

    <table id="fabricantesTable" class="table table-condensed table-striped table-hover table-bordered">
    <thead>
       <th>#</th><th>Nome</th><th>Tipo</th>
    </thead>
    <tbody></tbody>
    </table>

    <a class="btn" id="verMaisFabricantes">Ver mais</a>

  </div>

<%@ include file="../../bottom.jsp"%>

<script src="${pageContext.request.contextPath}/js/inventario.js"></script>

<script>
$(document).ready(function() {
  fabricante.getFabricantes(0, 10);
});
</script>
