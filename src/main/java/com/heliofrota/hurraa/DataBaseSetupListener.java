package com.heliofrota.hurraa;

import static org.mentalog.Log.Info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.eclipse.persistence.config.PersistenceUnitProperties;

import com.heliofrota.hurraa.entity.administracao.Autenticacao;
import com.heliofrota.hurraa.entity.administracao.Grupo;
import com.heliofrota.hurraa.entity.administracao.Usuario;

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
		
		Grupo group = new Grupo();
		group.setId("1");
		group.setNome("Administradores");
		Usuario user = new Usuario();
		user.setId("1");
		user.setEmail("admin@hurraa.org");
		user.setFone("null");		
		List<Grupo> grupos = new ArrayList<Grupo>();
		grupos.add(group);
		user.setGrupos(grupos);
		user.setNome("Admin");
		user.setFone("9999-9999");
		Autenticacao auth = new Autenticacao();
		auth.setId("1");
		auth.setEmail("admin@hurraa.org");
		auth.setSenha("admin");	
		auth.setUsuario(user);
		em.getTransaction().begin();
		em.persist(group);
		em.persist(user);
		em.persist(auth);
		em.getTransaction().commit();		
		emf.close();

		Info.log("database created.");
	}
}
