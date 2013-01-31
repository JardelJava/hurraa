package org.cejug;

import org.mentawai.core.MultiApplicationManager;

/**
 * O mentawai fornece suporte a multiplas classes de configuracao permitindo
 * maior separacao dos macro modulos da aplicacao.
 *
 * @author helio frota
 *
 */
public class AppManager extends MultiApplicationManager {
    
    /**
     * Metodo padrao do mentawai para registrar as varias classes centrais de
     * configuracao.
     *
     */
    @Override
    public void registerManagers() {

        // Configuracoes globais.
        register(ConfigManager.class);

        // Macro modulos da aplicacao.
        register(HurraaManager.class);
        register(AdministracaoManager.class);
    }
}