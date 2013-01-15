package org.cejug;

import org.mentawai.ajax.renderer.JsonRenderer;
import org.mentawai.core.ApplicationManager;
import org.mentawai.filter.AjaxFilter;
import org.mentawai.filter.JpaFilter;

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
        filter(new AjaxFilter(AJAX));
        on(AJAX, ajax(new JsonRenderer()));

        filter(new JpaFilter("hurraa"));
    }

}
