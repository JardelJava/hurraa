package org.cejug;

import org.cejug.action.administracao.FabricantesAction;
import org.cejug.helper.ViewPath;
import org.mentawai.ajax.renderer.JsonRenderer;
import org.mentawai.ajax.renderer.ResultRenderer;
import org.mentawai.core.ApplicationManager;
import org.mentawai.filter.AjaxFilter;
import org.mentawai.filter.AjaxValidationFilter;

/**
 * Classe de configuracao de actions.
 *
 * @author helio frota
 *
 */
public class AdministracaoManager extends ApplicationManager {
    
    /**
     * Metodo padrao do mentawai para configuracao das actions.
     */
    @Override
    public void loadActions() {

        // Filtros configurados para o modulo de Administracao.
        // Responsaveis pelo suporte ao ajax.
        ResultRenderer result = new ResultRenderer();
        AjaxFilter ajaxFilter = new AjaxFilter();
        AjaxValidationFilter ajaxValidationFilter = new AjaxValidationFilter();

        // Forward para a view.
        action("/Fabricantes", FabricantesAction.class).fwdOk(ViewPath.FABRICANTES);

        // Mapeamentos com tipo de requisicao e retorno ajax.
   
        action("/Fabricantes.getFabricantes", FabricantesAction.class)
                .on(AJAX, ajax(new JsonRenderer())).filter(ajaxFilter);

        action("/Fabricantes.addFabricante", FabricantesAction.class)
                .all(ajax(result)).filterFirst(ajaxValidationFilter);

    }
}
