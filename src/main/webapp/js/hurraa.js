
/*
 * Teste apenas.
 */
var teste = function() {
  $.ajax({
    url : 'FabricanteAction.teste.mtw',
    success : function(r) {
      console.log(r.responseText);
    }
  });
};

var salvar = document.getElementById('salvar');
salvar.onclick = function() {
	teste;
};
