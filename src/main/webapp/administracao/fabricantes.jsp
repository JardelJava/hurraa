<%@ include file="../top.jsp"%>
<body>

	<%@ include file="../nav.jsp"%>

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

      <table class="table table-condensed table-striped table-bordered">
       <thead>
         <tr>
          <th>#</th>
          <th>Fabricante</th>
          <th>Tipo</th>
          <th>a</th>
         </tr>
       </thead>
       <tbody>
         <tr>
           <td>1</td>
           <td>Fulano</td>
           <td>123456</td>
           <td>123456</td>
         </tr>
         <tr>
           <td>2</td>
           <td>Fulano2</td>
           <td>987654</td>
           <td>123456</td>
         </tr>
        </tbody>
      </table>

	</div>

<%@ include file="../bottom.jsp"%>