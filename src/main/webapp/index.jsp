<%@ include file="top.jsp"%>
<body>

	<%@ include file="nav.jsp"%>

	<div class="container" style="width: 98%;">

		<button type="button" class="btn" onclick="teste()">teste1</button>

		<form>
			<legend>teste</legend>

			<div class="row-fluid">
				<div class="span3">

					<label>Nome</label>
					<input type="text" placeholder="informe o telefone aqui... teste"> <label>Telefone</label>

				</div>
			</div>
			<button type="button" id="salvar" class="btn">Salvar</button>
		</form>

		<hr>

		<table class="table table-condensed">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>Telefone</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Fulano</td>
					<td>123456</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Fulano2</td>
					<td>987654</td>
				</tr>
			</tbody>
		</table>

	</div>

<%@ include file="bottom.jsp"%>