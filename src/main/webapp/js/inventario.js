/*
 * Responsavel por funcionalidade de fabricantes.
 */
var fabricante = (function () {

  $('#verMaisFabricantes').click(function() {
    fabricante.getLastItemId();
  });

  $('#novoFabricante').click(function() {
    $('#fabricanteForm')[0].reset();
    $('#alertContent').empty();
  });

  $('#salvarFabricante').click(function() {
    fabricante.addFabricante();
  });

  /* API publica */
  return {

    getFabricantes: function(inicio, limite) {
      $('#fabricantesTable').hide();
      $.getJSON('Fabricantes.getFabricantes.mtw?inicio=' + inicio + '&limite=' + limite, function(json) {
        if (json !== '') { $('#fabricantesTable table tbody').empty(); }
        var result = '';
          $.each(json, function(key, val) {
            result += '<tr>';
            result += '<td>' + val.id + '</td>';
            result += '<td>' + val.nome + '</td>';
            result += '<td>' + val.tipoLiteral + '</td>';
            result += '<td style="width:20px;cursor:pointer;" onclick="fabricante.prepareUpdateFabricante('+ val.id + ')"><i class="icon-pencil"></i></td>';
            result += '<td style="width:20px;cursor:pointer;" onclick="fabricante.confirmDeleteFabricante('+ val.id + ')"><i class="icon-trash"></i></td>';
            result += '</tr>';
            });
          $('#fabricantesTable > tbody:last').append(result);
        });
      $('#fabricantesTable').show();
    },

    getLastItemId: function () {
        var id = $('tr:last').children('td:first').html();
        this.getFabricantes(id, 10);
    },

    addFabricante: function () {
      $.ajax({ type: 'POST', url: 'Fabricantes.addFabricante.mtw', data: $('#fabricanteForm').serialize(),
          success: function(r) {
            handleResponse(r);
            if (!hasError) {
                this.getLastItemId();
                $('#cancelarFabricante').click();
            }
          }
       });
    }

  };
}());
