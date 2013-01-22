package org.cejug.persistence.impl;

import javax.persistence.EntityManager;

import org.cejug.persistence.UsuarioPersistence;
import org.cejug.pojo.administracao.Autenticacao;

public class UsuarioPersistenceImpl implements UsuarioPersistence {

	private EntityManager entityManager;

	public UsuarioPersistenceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Autenticacao autenticar(String email, String senha) {

		String query = "select a from Autenticacao a where a.email = :email "
		+ "and a.senha = :senha";

		return entityManager.createQuery(query, Autenticacao.class)
				.setParameter("email", email)
				.setParameter("senha", senha)
				.getSingleResult();
	}



}
