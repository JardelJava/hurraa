package org.cejug;

import org.cejug.action.HurraaAction;
import org.cejug.action.LoginAction;
import org.cejug.action.administracao.FabricantesAction;
import org.cejug.helper.ViewPath;
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
        .on(SUCCESS, redir(ViewPath.MAIN))
        .on(ERROR, fwd(ViewPath.LOGIN));

		action("/Logout", LogoutAction.class)
        .on(SUCCESS, redir(ViewPath.INDEX));

		ResultRenderer result = new ResultRenderer();

		action("/Hurraa", HurraaAction.class).fwdOk(ViewPath.MAIN);
		action("/Hurraa.administracao", HurraaAction.class).fwdOk(ViewPath.ADMINISTRACAO);
		action("/Hurraa.inventario", HurraaAction.class).fwdOk(ViewPath.INVENTARIO);

		action("/Fabricantes", FabricantesAction.class).fwdOk(ViewPath.FABRICANTES);
		action("/Fabricantes.getFabricantes", FabricantesAction.class).all(ajax(result));

	}

}
