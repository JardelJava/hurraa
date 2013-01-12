package org.cejug;

import org.mentawai.ajax.renderer.JsonRenderer;
import org.mentawai.core.ApplicationManager;
import org.mentawai.filter.AjaxFilter;

/**
 * Default Mentawai Application Manager class AppManager.
 * 
 * @author helio frota
 *
 */
public class AppManager extends ApplicationManager {

	/**
	 * Default Mentawai method to load all global filters.
	 */
	@Override
    public void loadFilters() {
        filter(new AjaxFilter(AJAX));
        on(AJAX, ajax(new JsonRenderer()));
    }
	
	
}