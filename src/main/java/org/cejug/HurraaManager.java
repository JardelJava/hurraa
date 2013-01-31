package org.cejug;

import org.cejug.action.HurraaAction;
import org.cejug.action.LoginAction;
import org.cejug.helper.ViewPath;
import org.mentawai.action.LogoutAction;
import org.mentawai.core.ApplicationManager;

/**
 * Classe de configuracao de actions.
 *
 * @author helio frota
 *
 */
public class HurraaManager extends ApplicationManager {
    
    /**
     * Metodo padrao do mentawai para configuracao das actions.
     */
    @Override
    public void loadActions() {

        // Mapeamentos gerais de forward e/ou redirect sem ajax.
        action("/Login", LoginAction.class)
                .on(SUCCESS, redir(ViewPath.MAIN))
                .on(ERROR, fwd(ViewPath.LOGIN));

        action("/Logout", LogoutAction.class)
                .on(SUCCESS, redir(ViewPath.INDEX));

        // Navegacao simples com forward.
        action("/Hurraa", HurraaAction.class).fwdOk(ViewPath.MAIN);
        action("/Hurraa.administracao", HurraaAction.class).fwdOk(ViewPath.ADMINISTRACAO);
        action("/Hurraa.inventario", HurraaAction.class).fwdOk(ViewPath.INVENTARIO);

    }
}
