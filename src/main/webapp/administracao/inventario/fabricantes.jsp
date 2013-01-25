<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@ include file="../../top.jsp"%>
<body>

  <%@ include file="../../nav.jsp"%>

  <div class="container" style="width: 98%;">

      <div class="page-header">
        <h4>Fabricantes:</h4>
      </div>

      <table id="fabricantesTable" class="table table-condensed table-striped table-hover table-bordered">
      <thead>
         <th>#</th><th>Nome</th><th>Tipo</th>
      </thead>
      <tbody></tbody>
      </table>
      <a class="btn pull-right" id="verMaisFabricantes">Ver mais</a>

  </div>

<%@ include file="../../bottom.jsp"%>

<script src="${pageContext.request.contextPath}/js/inventario.js"></script>

<script>
$(document).ready(function() {
	fabricante.getFabricantes(0, 10);
});
</script>
