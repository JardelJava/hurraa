package org.cejug.action;

import org.mentawai.core.BaseAction;

/**
 * Action HurraaAction.
 *
 * @author helio frota
 *
 */
public class HurraaAction extends BaseAction {

    /**
     * InnerAction default.
     *
     * @return String
     */
    @Override
    public String execute() {
        return SUCCESS;
    }

    /**
     * Forward para view definida em HurraaManager.
     * @return String
     */
    public String inventario() {
        return SUCCESS;
    }

    /**
     * Forward para view definida em HurraaManager.
     * @return String
     */
    public String administracao() {
        return SUCCESS;
    }
}
