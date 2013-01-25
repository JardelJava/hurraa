<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@ include file="../../top.jsp"%>
<body>

  <%@ include file="../../nav.jsp"%>

  <div class="container" style="width: 98%;">

      <ul class="breadcrumb">
        <li><a href="${pageContext.request.contextPath}">Home</a> <span class="divider">/</span></li>
        <li><a href="#">Administração</a> <span class="divider">/</span></li>
        <li><a href="#">Inventário</a> <span class="divider">/</span></li>
        <li class="active">Fabricantes</li>
      </ul>

      <div class="page-header">
        <h4>Fabricantes:</h4>
      </div>


      <table id="fabricantesTable" class="table table-condensed table-striped table-hover table-bordered">
      <thead>
         <th>#</th><th>Nome</th><th>Tipo</th>
      </thead>
      <tbody></tbody>
      </table>
      <a class="btn pull-right" onclick="lastId()">Ver mais</a>

  </div>

<%@ include file="../../bottom.jsp"%>

<script>
function getFabricantes(i, l) {
	$('#fabricantesTable').hide();
	$.getJSON('Fabricantes.getFabricantes.mtw?inicio=' + i + '&limite=' + l, function(json) {
		if (json != '') { $('#fabricantesTable table tbody').empty(); }
		var result = '';
	    $.each(json, function(key, val) {
	    	result += '<tr>';
	    	result += '<td>' + val.id + '</td>';
	    	result += '<td>' + val.nome + '</td>';
	    	result += '<td>' + val.tipoLiteral + '</td>';
	    	result += '</tr>';
        });
	    $('#fabricantesTable > tbody:last').append(result);
    });
	$('#fabricantesTable').show();
}

function lastId() {
	var tr = $('#fabricantesTable tr:last');
    var id = $('tr:last').children('td:first').html();
    getFabricantes(id, 10);
}

$(document).ready(function() {
	getFabricantes(0, 10);
});
</script>
