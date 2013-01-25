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
        .on(SUCCESS, redir(main))
        .on(ERROR, fwd(login));

		action("/Logout", LogoutAction.class)
        .on(SUCCESS, redir(index));

		ResultRenderer result = new ResultRenderer();

		action("/Hurra", HurraaAction.class).fwdOk(main);
		action("/Fabricantes", FabricantesAction.class).fwdOk(fabricantes);
		action("/Fabricantes.getFabricantes", FabricantesAction.class).all(ajax(result));

	}

}
