package org.cejug.persistence.impl;

import java.util.List;
import javax.persistence.EntityManager;
import org.cejug.persistence.InventarioPersistence;
import org.cejug.persistence.util.SuportePersistencia;
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
        @Override
	public List < Fabricante > getFabricantes(int inicio, int limite) {
		String query = "select f from Fabricante f order by f.nome asc";
		return entityManager.createQuery(query, Fabricante.class)
				.setFirstResult(inicio)
				.setMaxResults(limite)
				.getResultList();
	}

    @Override
    public void saveFabricante(Fabricante fabricante) {
        entityManager.getTransaction().begin();
        if (SuportePersistencia.INSTANCE.isIdNotValid(fabricante)) {
            fabricante.setId(SuportePersistencia.INSTANCE.gerarIdValido());
            entityManager.persist(fabricante);
        } else {
            entityManager.merge(fabricante);
        }
        entityManager.getTransaction().commit();
    }
}
