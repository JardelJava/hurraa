package org.cejug;

import org.cejug.action.administracao.FabricanteAction;
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

		action(FabricanteAction.class);

	}

}
