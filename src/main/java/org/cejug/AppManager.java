package org.cejug;

import org.mentawai.core.MultiApplicationManager;

/**
 * MultiApplicationManager class AppManager.
 *
 * Helps the organization and separation of macro modules.
 *
 * @author helio frota
 *
 */
public class AppManager extends MultiApplicationManager {

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerManagers() {

        // Global configuration.
        register(ConfigManager.class);

        // Hurraa macro modules.
        register(AdministracaoManager.class);
    }

}