package org.cejug;

import org.cejug.action.HurraAction;
import org.cejug.action.LoginAction;
import org.cejug.action.administracao.FabricantesAction;
import org.cejug.helper.ViewPath;
import org.mentawai.action.LogoutAction;
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

		action("/Login", LoginAction.class)
        .on(SUCCESS, redir(ViewPath.main))
        .on(ERROR, fwd(ViewPath.login));

		action("/Logout", LogoutAction.class)
        .on(SUCCESS, redir(ViewPath.index));

		action("/Hurra", HurraAction.class).fwdOk(ViewPath.main);
		action(FabricantesAction.class).fwdOk(ViewPath.fabricantes);

	}

}
