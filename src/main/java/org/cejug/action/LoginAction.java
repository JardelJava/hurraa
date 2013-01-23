package org.cejug.action;

import javax.persistence.NoResultException;

import org.cejug.business.UsuarioBusiness;
import org.cejug.pojo.administracao.Autenticacao;
import org.mentawai.action.BaseLoginAction;

/**
 * Action de login para validar a autenticação.
 *
 * @author helio frota
 *
 */
public class LoginAction extends BaseLoginAction {

	private UsuarioBusiness usuarioBusiness;

	public LoginAction(UsuarioBusiness usuarioBusiness) {
		this.usuarioBusiness = usuarioBusiness;
	}

	public String execute() {

		Autenticacao autenticacao = null;

		try {
			autenticacao = usuarioBusiness.autenticar(input.getString("email"),
					input.getString("senha"));
    	} catch (NoResultException e) { /*:] log this.*/ }

		if (autenticacao != null) {
			setSessionObj(autenticacao.getEmail());
		}
		return SUCCESS;
	}

}
