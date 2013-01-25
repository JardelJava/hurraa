package org.cejug.persistence;

import java.util.List;

import org.cejug.pojo.Fabricante;

/**
 * Interface de persistencia InventarioPersistence.
 *
 * @author helio frota
 *
 */
public interface InventarioPersistence {

	/**
	 * Busca fabricantes na base de dados com determinado limite e offset.
	 * @param inicio int
	 * @param limite int
	 * @return List < Fabricante >
	 */
	public List < Fabricante > getFabricantes(int inicio, int limite);

}
