package org.cejug.action.administracao;

import java.util.List;

import javax.persistence.EntityManager;

import org.cejug.pojo.Fabricante;
import org.mentawai.core.BaseAction;
import org.mentawai.filter.JpaFilter;

/**
 * Action class FabricanteAction.
 *
 * @author helio frota
 *
 */
public class FabricantesAction extends BaseAction {

	/**
	 * Returns to output all fabricantes from database.
	 */
	public void allFabricantes() {

		// Gets the entityManager from action input.
        EntityManager entityManager = (EntityManager) input.getValue(JpaFilter.KEY);

        // Gets the list of fabricante object from database.
        List < Fabricante > list = entityManager.createNamedQuery("Fabricante.findAll", Fabricante.class).getResultList();

        // Puts the fabricante list on output as JSON.
        output.setValue("fabricantes", list);

    }

}
