package org.cejug.action.administracao;

import org.cejug.business.InventarioBusiness;
import org.mentawai.core.BaseAction;

/**
 * Action FabricanteAction.
 *
 * @author helio frota
 *
 */
public class FabricantesAction extends BaseAction {

	private InventarioBusiness inventarioBusiness;

	public FabricantesAction(InventarioBusiness inventarioBusiness) {
		this.inventarioBusiness = inventarioBusiness;
	}

	public String execute() {
		return SUCCESS;
	}

	public void getFabricantes() {
		ajax(inventarioBusiness.getFabricantes(input.getInt("inicio"), input.getInt("limite")));
	}

}
