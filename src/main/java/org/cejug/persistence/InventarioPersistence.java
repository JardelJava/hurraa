package org.cejug.persistence;

import java.util.List;

import org.cejug.pojo.Fabricante;

public interface InventarioPersistence {

	public List < Fabricante > getFabricantes(int inicio, int limite);

}
