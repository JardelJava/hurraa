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
package com.heliofrota.hurraa;

import javax.persistence.EntityManager;

import org.mentawai.core.ApplicationManager;
import org.mentawai.db.JPAHandler;
import org.mentawai.filter.AuthenticationFilter;
import org.mentawai.filter.CharacterEncodingFilter;
import org.mentawai.filter.MentaContainerFilter;
import org.mentawai.filter.ValidationFilter;

import com.heliofrota.hurraa.business.InventarioBusiness;
import com.heliofrota.hurraa.business.UsuarioBusiness;
import com.heliofrota.hurraa.business.impl.InventarioBusinessImpl;
import com.heliofrota.hurraa.business.impl.UsuarioBusinessImpl;
import com.heliofrota.hurraa.helper.ViewPath;
import com.heliofrota.hurraa.persistence.InventarioPersistence;
import com.heliofrota.hurraa.persistence.UsuarioPersistence;
import com.heliofrota.hurraa.persistence.impl.InventarioPersistenceImpl;
import com.heliofrota.hurraa.persistence.impl.UsuarioPersistenceImpl;

/**
 * Classe responsavel por varias configuracoes programaticas.
 *
 * @author helio frota
 *
 */
public class ConfigManager extends ApplicationManager {
    
    /**
     * Metodo padrao do Mentawai para configuracao dos filtros.
     *
     * Aqui configuramos os filtros globais da aplicacao.
     *
     */
    @Override
    public void loadFilters() {

        filter(new AuthenticationFilter());
        on(LOGIN, redir(ViewPath.LOGIN));

        filter(new MentaContainerFilter());
        filter(new CharacterEncodingFilter());
        filter(new ValidationFilter());
    }

    /**
     * Metodo padrao do Mentawai para configuracao do container IOC.
     * 
     */
    @Override
    public void setupIoC() {
        
        /* O parametro false no JPAHandler indica que o desenvolvedor
         * sera responsavel por obter a transacao do entityManager.
         */
         ioc(EntityManager.class, new JPAHandler("hurraa", false));

        /* Configurando interfaces com devidas implementacoes para
         * serem injetadas via construtor nas classes.
         */
        ioc(UsuarioPersistence.class, UsuarioPersistenceImpl.class);
        ioc(InventarioPersistence.class, InventarioPersistenceImpl.class);

        ioc(UsuarioBusiness.class, UsuarioBusinessImpl.class);
        ioc(InventarioBusiness.class, InventarioBusinessImpl.class);
    }
}
