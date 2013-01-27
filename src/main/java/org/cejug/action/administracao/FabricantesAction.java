package org.cejug.action.administracao;

import org.cejug.business.InventarioBusiness;
import org.cejug.pojo.Fabricante;
import org.mentawai.core.BaseAction;
import org.mentawai.rule.RequiredFieldRule;
import org.mentawai.rule.StringRule;
import org.mentawai.validation.Validatable;
import org.mentawai.validation.Validator;

/**
 * Action FabricantesAction.
 *
 * @author helio frota
 *
 */
public class FabricantesAction extends BaseAction implements Validatable {

    /**
     * Classe de negocio injetada pelo mentaContainer.
     */
    private InventarioBusiness inventarioBusiness;

    /**
     * Construtor parametrico usando constructor injection.
     * @param inventarioBusiness InventarioBusiness
     */
    public FabricantesAction(InventarioBusiness inventarioBusiness) {
        this.inventarioBusiness = inventarioBusiness;
    }

    /**
     * Metodo default execute.
     */
    public String execute() {
        return SUCCESS;
    }

    /**
     * Retorna lista de fabricantes no formato JSON com determinado limite e offset.
     */
    public void getFabricantes() {
        ajax(inventarioBusiness.getFabricantes(input.getInt("inicio"), input.getInt("limite")));
    }

    public void addFabricante() {
        Fabricante fabricante = new Fabricante();
        fabricante.setNome(input.getString("fabricanteNome"));
        fabricante.setTipo(input.getInt("fabricanteTipo"));

        inventarioBusiness.addFabricante(fabricante);

        ajax("Fabricante cadastrado com sucesso.");
    }

    @Override
    public void prepareValidator(Validator validator, String innerAction) {
        if (!isEmpty(innerAction)) {
            if (innerAction.equals("addFabricante")) {
                validator.add("fabricanteNome", RequiredFieldRule.getInstance(), "Nome do fabricante obrigatório.");
                validator.add("fabricanteNome", StringRule.getInstance(3, 30), "Nome do fabricante deverá possuir entre 3 e 30 caracteres.");
            } else if (innerAction.equals("updateFabricante")) {
                validator.add("fabricanteNome", RequiredFieldRule.getInstance(), "Nome do fabricante obrigatório.");
                validator.add("fabricanteNome", StringRule.getInstance(3, 30), "Nome do fabricante deverá possuir entre 3 e 30 caracteres.");
            }
        }
    }


}
