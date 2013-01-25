
var fabricante = (function () {
  
  var bt = $('#verMaisFabricantes').click(function() {
	  fabricante.getLastItemId();
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
    	var tr = $('#fabricantesTable tr:last');
        var id = $('tr:last').children('td:first').html();
        this.getFabricantes(id, 10);
    }
    
  };
}());
