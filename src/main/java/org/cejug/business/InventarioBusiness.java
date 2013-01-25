package org.cejug.business;

import java.util.List;

import org.cejug.pojo.Fabricante;

public interface InventarioBusiness {

	public List < Fabricante > getFabricantes(int inicio, int limite);

}
