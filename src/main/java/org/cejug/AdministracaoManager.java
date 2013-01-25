package org.cejug;

import org.cejug.action.HurraaAction;
import org.cejug.action.LoginAction;
import org.cejug.action.administracao.FabricantesAction;
import static org.cejug.helper.ViewPath.*;
import org.mentawai.action.LogoutAction;
import org.mentawai.ajax.renderer.ResultRenderer;
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
        .on(SUCCESS, redir(MAIN))
        .on(ERROR, fwd(LOGIN));

		action("/Logout", LogoutAction.class)
        .on(SUCCESS, redir(INDEX));

		ResultRenderer result = new ResultRenderer();

		action("/Hurra", HurraaAction.class).fwdOk(MAIN);
		action("/Fabricantes", FabricantesAction.class).fwdOk(FABRICANTES);
		action("/Fabricantes.getFabricantes", FabricantesAction.class).all(ajax(result));

	}

}
