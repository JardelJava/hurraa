package org.cejug;

import javax.persistence.EntityManager;

/**
 * Helper class EntityManagerWrapper.
 *
 * @author helio frota
 *
 */
public class EntityManagerWrapper {

	/**
	 * Attribute entityManager of EntityManagerWrapper.
	 */
	private static EntityManager entityManager;

	/**
	 * Gets the entityManager.
	 * @return EntityManager
	 */
	public static EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Sets the entityManager.
	 * @param entityManager the entityManager to set
	 */
	public static void setEntityManager(EntityManager entityManager) {
		EntityManagerWrapper.entityManager = entityManager;
	}

}
