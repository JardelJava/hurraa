package org.cejug.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.cejug.persistence.InventarioPersistence;
import org.cejug.pojo.Fabricante;

public class InventarioPersistenceImpl implements InventarioPersistence {

	private EntityManager entityManager;

	public InventarioPersistenceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List < Fabricante > getFabricantes(int inicio, int limite) {
		String query = "select f from Fabricante f";
		return entityManager.createQuery(query, Fabricante.class)
				.setFirstResult(inicio)
				.setMaxResults(limite)
				.getResultList();
	}

}
