package com.heliofrota.hurraa;

import static org.mentalog.Log.Info;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

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

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hurraa");
		emf.createEntityManager();
		emf.close();
		
		Info.log("database created.");
	}

}
