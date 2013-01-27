var hasError = false;
function handleResponse(r) {
  if (r.indexOf('{') > -1) {
    var arrayField = r.substring(1, r.length - 1).split(',');
    var i = 0;
    var f = null;
    var msgs = '';
    var content = '';
    content += '<div class="alert alert-error">';
    content += '<a class="close" data-dismiss="alert">×</a>';
    content += '<strong>Atenção:</strong><br>';
    for (i = 0; i < arrayField.length; i++) {
      f = arrayField[i];
      f = f.substring(f.indexOf('=') + 1);
      f = $.trim(f);
      msgs += f + '<br>';
      hasError = true;
    }
    content += msgs;
    content += '</div>';
    document.getElementById('alertContent').innerHTML = content;
  } else {
    if (response != 'NO_FEEDBACK') {
      console.log(response);
    }
    hasError = false;
  }
}
