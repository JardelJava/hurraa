package com.heliofrota.hurraa;

import static org.mentalog.Log.Info;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.eclipse.persistence.config.PersistenceUnitProperties;

import com.heliofrota.hurraa.entity.administracao.Autenticacao;

/**
 * Listener que cria o contexto do JPA para geração do DDL.
 * 
 * @author helio frota http://www.heliofrota.com
 * 
 */
@WebListener()
public class DataBaseSetupListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		Info.log("see you later...");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		Info.log("database setup...");

		Map<String, String> persistenceUnitProperties = new HashMap<>();
		
		persistenceUnitProperties.put(PersistenceUnitProperties.DDL_GENERATION, "create-tables");
		persistenceUnitProperties.put(PersistenceUnitProperties.DDL_GENERATION_MODE, "database");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hurraa", persistenceUnitProperties);
		emf.createEntityManager();
		EntityManager em = emf.createEntityManager(persistenceUnitProperties);
		Autenticacao auth = new Autenticacao();
		auth.setId("1");
		auth.setEmail("admin@hurra.org");
		auth.setSenha("admin");
		em.getTransaction().begin();
		em.persist(auth);
		em.getTransaction().commit();		
		emf.close();

		Info.log("database created.");
	}
}
