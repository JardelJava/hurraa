package org.cejug.action.administracao;

import org.cejug.business.InventarioBusiness;
import org.mentawai.core.BaseAction;

/**
 * Action FabricantesAction.
 *
 * @author helio frota
 *
 */
public class FabricantesAction extends BaseAction {

	/**
	 * Classe de negocio injetada pelo mentaContainer.
	 */
	private InventarioBusiness inventarioBusiness;

	/**
	 * Construtor parametrico usando constructor injection.
	 * @param inventarioBusiness InventarioBusiness
	 */
	public FabricantesAction(InventarioBusiness inventarioBusiness) {
		this.inventarioBusiness = inventarioBusiness;
	}

	/**
	 * Metodo default execute.
	 */
	public String execute() {
		return SUCCESS;
	}

	/**
	 * Retorna lista de fabricantes no formato JSON com determinado limite e offset.
	 */
	public void getFabricantes() {
		ajax(inventarioBusiness.getFabricantes(input.getInt("inicio"), input.getInt("limite")));
	}

}
