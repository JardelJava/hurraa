/*
 *   Hurraa http://code.google.com/p/hurraa/
 *
 *   This file is part of Hurraa.
 *
 *   Hurraa is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Hurraa is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Hurraa.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
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
