package org.cejug.persistence;

import org.cejug.pojo.administracao.Autenticacao;

public interface UsuarioPersistence {

	public Autenticacao autenticar(String email, String senha);

}
