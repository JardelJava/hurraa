package org.cejug.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.cejug.persistence.InventarioPersistence;
import org.cejug.pojo.Fabricante;

/**
 * Classe de persistencia InventarioPersistenceImpl.
 * @author helio frota
 *
 */
public class InventarioPersistenceImpl implements InventarioPersistence {

	/**
	 * EntityManager injetado pelo mentaContainer.
	 */
	private EntityManager entityManager;

	/**
	 * Construtor parametrico.
	 *
	 * @param entityManager EntityManager
	 */
	public InventarioPersistenceImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Busca fabricantes na base de dados com determinado limite e offset.
	 * @param inicio int
	 * @param limite int
	 * @return List < Fabricante >
	 */
	public List < Fabricante > getFabricantes(int inicio, int limite) {
		String query = "select f from Fabricante f";
		return entityManager.createQuery(query, Fabricante.class)
				.setFirstResult(inicio)
				.setMaxResults(limite)
				.getResultList();
	}

	public void addFabricante(Fabricante fabricante) {
		entityManager.getTransaction().begin();
		entityManager.persist(fabricante);
		entityManager.getTransaction().commit();
	}
}
