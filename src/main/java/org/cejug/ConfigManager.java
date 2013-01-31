package org.cejug;

import javax.persistence.EntityManager;

import org.cejug.business.InventarioBusiness;
import org.cejug.business.UsuarioBusiness;
import org.cejug.business.impl.InventarioBusinessImpl;
import org.cejug.business.impl.UsuarioBusinessImpl;
import org.cejug.helper.ViewPath;
import org.cejug.persistence.InventarioPersistence;
import org.cejug.persistence.UsuarioPersistence;
import org.cejug.persistence.impl.InventarioPersistenceImpl;
import org.cejug.persistence.impl.UsuarioPersistenceImpl;
import org.mentawai.core.ApplicationManager;
import org.mentawai.db.JPAHandler;
import org.mentawai.filter.AuthenticationFilter;
import org.mentawai.filter.CharacterEncodingFilter;
import org.mentawai.filter.MentaContainerFilter;
import org.mentawai.filter.ValidationFilter;

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
