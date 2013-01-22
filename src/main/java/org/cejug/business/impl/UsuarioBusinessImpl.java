package org.cejug.business.impl;

import org.cejug.business.UsuarioBusiness;
import org.cejug.persistence.UsuarioPersistence;
import org.cejug.pojo.administracao.Autenticacao;

public class UsuarioBusinessImpl implements UsuarioBusiness {

	private UsuarioPersistence usuarioPersistence;

	public UsuarioBusinessImpl(UsuarioPersistence usuarioPersistence) {
		this.usuarioPersistence = usuarioPersistence;
	}

	@Override
	public Autenticacao autenticar(String email, String senha) {
		return usuarioPersistence.autenticar(email, senha);
	}

}
