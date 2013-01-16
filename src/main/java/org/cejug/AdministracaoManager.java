package org.cejug;

import org.cejug.action.administracao.FabricantesAction;
import org.cejug.helper.ActionPaths;
import org.mentawai.core.ApplicationManager;

/**
 * ApplicationManager class AdministracaoManager.
 *
 * @author helio frota
 *
 */
public class AdministracaoManager extends ApplicationManager {


	@Override
	public void loadActions() {

		action(FabricantesAction.class).fwdOk(ActionPaths.fabricantes);

	}

}
