package org.cejug.business;

import org.cejug.pojo.administracao.Autenticacao;

/**
 * Interface de negocio UsuarioBusiness.
 *
 * @author helio frota
 *
 */
public interface UsuarioBusiness {

	/**
	 * Autenticacao de email e senha via camada de persistencia.
	 *
	 * @param email String
	 * @param senha String
	 * @return Autenticacao
	 */
	public Autenticacao autenticar(String email, String senha);
}
