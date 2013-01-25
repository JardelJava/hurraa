package org.cejug.business.impl;

import org.cejug.business.UsuarioBusiness;
import org.cejug.persistence.UsuarioPersistence;
import org.cejug.pojo.administracao.Autenticacao;

/**
 * Classe de negocio UsuarioBusinessImpl.
 *
 * @author helio frota
 *
 */
public class UsuarioBusinessImpl implements UsuarioBusiness {

	/**
	 * Classe de persistencia injetada pelo mentaContainer.
	 */
	private UsuarioPersistence usuarioPersistence;

	/**
	 * Construtor parametrico.
	 *
	 * @param usuarioPersistence UsuarioPersistence
	 */
	public UsuarioBusinessImpl(UsuarioPersistence usuarioPersistence) {
		this.usuarioPersistence = usuarioPersistence;
	}

	/**
	 * Autenticacao de email e senha via camada de persistencia.
	 *
	 * @param email String
	 * @param senha String
	 * @return Autenticacao
	 */
	public Autenticacao autenticar(String email, String senha) {
		return usuarioPersistence.autenticar(email, senha);
	}

}
