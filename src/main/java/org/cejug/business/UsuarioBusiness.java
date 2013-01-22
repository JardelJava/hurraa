package org.cejug.business;

import org.cejug.pojo.administracao.Autenticacao;

public interface UsuarioBusiness {

	public Autenticacao autenticar(String email, String senha);
}
