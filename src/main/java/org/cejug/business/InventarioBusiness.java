package org.cejug.business;

import java.util.List;

import org.cejug.pojo.Fabricante;

/**
 * Classe de negocio UsuarioBusinessImpl.
 *
 * @author helio frota
 *
 */
public interface InventarioBusiness {

    /**
     * Busca fabricantes via camada de persistencia com determinado limite e
     * offset.
     *
     * @param inicio int
     * @param limite int
     * @return List < Fabricante >
     */
    public List<Fabricante> getFabricantes(int inicio, int limite);

    public void addFabricante(Fabricante fabricante);
}
