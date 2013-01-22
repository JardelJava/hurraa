package org.cejug.persistence;

import org.cejug.pojo.administracao.Autenticacao;

/**
 * Interface de persistencia UsuarioPersistence.
 *
 * @author helio frota
 *
 */
public interface UsuarioPersistence {

	/**
	 * Autenticacao de email e senha na base de dados.
	 *
	 * @param email String
	 * @param senha String
	 * @return Autenticacao
	 */
	public Autenticacao autenticar(String email, String senha);

}
