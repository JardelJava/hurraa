package org.cejug.persistence.impl;

import javax.persistence.EntityManager;

import org.cejug.persistence.UsuarioPersistence;
import org.cejug.pojo.administracao.Autenticacao;

/**
 * Classe de persistencia UsuarioPersistenceImpl.
 *
 * @author helio frota
 *
 */
public class UsuarioPersistenceImpl implements UsuarioPersistence {

	/**
	 * EntityManager injetado pelo mentaContainer.
	 */
	private EntityManager entityManager;

	/**
	 * Construtor parametrico.
	 *
	 * @param entityManager EntityManager
	 */
	public UsuarioPersistenceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Autenticacao de email e senha na base de dados.
	 *
	 * @param email String
	 * @param senha String
	 * @return Autenticacao
	 */
	public Autenticacao autenticar(String email, String senha) {

		String query = "select a from Autenticacao a where a.email = :email "
		+ "and a.senha = :senha";

		return entityManager.createQuery(query, Autenticacao.class)
				.setParameter("email", email)
				.setParameter("senha", senha)
				.getSingleResult();
	}



}
