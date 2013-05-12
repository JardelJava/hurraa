/*
 *   Hurraa http://github.com/heliofrota/hurraa/
 *
 *   This file is part of Hurraa.
 *
 *   Hurraa is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Hurraa is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Hurraa.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.heliofrota.hurraa.action;

import javax.persistence.NoResultException;

import org.mentawai.action.BaseLoginAction;

import com.heliofrota.hurraa.business.UsuarioBusiness;
import com.heliofrota.hurraa.entity.administracao.Autenticacao;

import static org.mentalog.Log.*;

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

    @Override
    public String execute() {

        Autenticacao autenticacao = null;

        try {
            autenticacao = usuarioBusiness.autenticar(input.getString("email"),
                    input.getString("senha"));
        } catch (NoResultException e) {
            Warn.log(e.getMessage());
        }

        if (autenticacao != null) {
            setSessionObj(autenticacao.getEmail());
        }
        return SUCCESS;
    }
}
