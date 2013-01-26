
var fabricante = (function () {

  $('#verMaisFabricantes').click(function() {
	  fabricante.getLastItemId();
  });

  $('#novoFabricante').click(function() {
    $('#fabricanteForm')[0].reset();
  });

  return {

    getFabricantes: function(inicio, limite) {
    	$('#fabricantesTable').hide();
    	$.getJSON('Fabricantes.getFabricantes.mtw?inicio=' + inicio + '&limite=' + limite, function(json) {
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
    },

    getLastItemId: function () {
        var id = $('tr:last').children('td:first').html();
        this.getFabricantes(id, 10);
    }

  };
}());
