package com.heliofrota.hurraa;

import static org.mentalog.Log.Info;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.eclipse.persistence.config.PersistenceUnitProperties;

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
		emf.close();

		Info.log("database created.");
	}
}
