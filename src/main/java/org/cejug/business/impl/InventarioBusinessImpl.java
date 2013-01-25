package org.cejug.business.impl;

import java.util.List;

import org.cejug.business.InventarioBusiness;
import org.cejug.persistence.InventarioPersistence;
import org.cejug.pojo.Fabricante;

public class InventarioBusinessImpl implements InventarioBusiness {

	private InventarioPersistence inventarioPersistence;

	public InventarioBusinessImpl(InventarioPersistence inventarioPersistence) {
		this.inventarioPersistence = inventarioPersistence;
	}

	public List < Fabricante > getFabricantes(int inicio, int limite) {
		return inventarioPersistence.getFabricantes(inicio, limite);
	}

}
