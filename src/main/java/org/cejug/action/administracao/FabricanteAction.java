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
public class FabricanteAction extends BaseAction {

    public void teste() {

        EntityManager entityManager = (EntityManager) input.getValue(JpaFilter.KEY);

        List < Fabricante > list = entityManager.createNamedQuery("Fabricante.findAll", Fabricante.class).getResultList();

        output.setValue("fabricantes", list);

    }

}
