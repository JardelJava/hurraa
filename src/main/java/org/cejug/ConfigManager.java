package org.cejug;

import javax.persistence.EntityManager;

import org.cejug.business.InventarioBusiness;
import org.cejug.business.UsuarioBusiness;
import org.cejug.business.impl.InventarioBusinessImpl;
import org.cejug.business.impl.UsuarioBusinessImpl;
import org.cejug.helper.ViewPath;
import org.cejug.persistence.InventarioPersistence;
import org.cejug.persistence.UsuarioPersistence;
import org.cejug.persistence.impl.InventarioPersistenceImpl;
import org.cejug.persistence.impl.UsuarioPersistenceImpl;
import org.mentawai.ajax.renderer.JsonRenderer;
import org.mentawai.core.ApplicationManager;
import org.mentawai.db.JPAHandler;
import org.mentawai.filter.AjaxFilter;
import org.mentawai.filter.AuthenticationFilter;
import org.mentawai.filter.MentaContainerFilter;

/**
 * ApplicationManager class ConfigManager.
 *
 * Responsible for all global programmatic configurations.
 *
 * @author helio frota
 *
 */
public class ConfigManager extends ApplicationManager {

	/**
	 * Default Mentawai method loadFilters.
	 *
	 * This method loads all global related filters on
	 * application.
	 *
	 */
	@Override
    public void loadFilters() {

		filter(new AuthenticationFilter());
        on(LOGIN, redir(ViewPath.login));

        filter(new AjaxFilter(AJAX));
        on(AJAX, ajax(new JsonRenderer()));

        filter(new MentaContainerFilter());
    }

	@Override
    public JPAHandler createJPAHandler() {
    	return new JPAHandler("hurraa", true);
    }

    @Override
    public void setupIoC() {
        ioc(EntityManager.class, new JPAHandler("hurraa", true));

        ioc(UsuarioPersistence.class, UsuarioPersistenceImpl.class);
        ioc(InventarioPersistence.class, InventarioPersistenceImpl.class);

        ioc(UsuarioBusiness.class, UsuarioBusinessImpl.class);
        ioc(InventarioBusiness.class, InventarioBusinessImpl.class);
    }

}
