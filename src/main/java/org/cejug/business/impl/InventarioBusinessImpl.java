package org.cejug.business.impl;

import java.util.List;

import org.cejug.business.InventarioBusiness;
import org.cejug.persistence.InventarioPersistence;
import org.cejug.pojo.Fabricante;

/**
 * Classe de negocio InventarioBusinessImpl.
 *
 * @author helio frota
 *
 */
public class InventarioBusinessImpl implements InventarioBusiness {

    /**
     * Classe de persistencia injetada pelo mentaContainer.
     */
    private InventarioPersistence inventarioPersistence;

    /**
     * Construtor parametrico.
     *
     * @param inventarioPersistence InventarioPersistence
     */
    public InventarioBusinessImpl(InventarioPersistence inventarioPersistence) {
        this.inventarioPersistence = inventarioPersistence;
    }

    /**
     * Busca fabricantes via camada de persistencia com determinado limite e
     * offset.
     *
     * @param inicio int
     * @param limite int
     * @return List < Fabricante >
     */
    public List< Fabricante> getFabricantes(int inicio, int limite) {
        return inventarioPersistence.getFabricantes(inicio, limite);
    }

    public void addFabricante(Fabricante fabricante) {
        inventarioPersistence.addFabricante(fabricante);
    }
}
