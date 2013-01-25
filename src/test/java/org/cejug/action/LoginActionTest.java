package org.cejug.action;

import javax.persistence.EntityManager;

import org.cejug.business.UsuarioBusiness;
import org.cejug.business.impl.UsuarioBusinessImpl;
import org.cejug.persistence.UsuarioPersistence;
import org.cejug.persistence.impl.UsuarioPersistenceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mentacontainer.Container;
import org.mentacontainer.impl.MentaContainer;
import org.mentawai.db.JPAHandler;
import org.mentawai.util.MockAction;


/**
 * Classe de teste LoginActionTest.
 *
 * @author helio frota
 *
 */
public class LoginActionTest {

	private LoginAction action;
	
	private MockAction mockAction;
	
	private UsuarioBusiness usuarioBusiness;

	@Before
	public void setUp() throws Exception {
		Container container = new MentaContainer();
		container.ioc(EntityManager.class, new JPAHandler("hurraa", true));
		container.ioc(UsuarioPersistence.class, UsuarioPersistenceImpl.class).addConstructorDependency(EntityManager.class);
		container.ioc(UsuarioBusiness.class, UsuarioBusinessImpl.class).addConstructorDependency(UsuarioPersistence.class);
		
		usuarioBusiness = container.get(UsuarioBusiness.class);
		
		action = new LoginAction(usuarioBusiness);
		mockAction = new MockAction(action);
		action.setInput(mockAction.getInput());
		action.setOutput(mockAction.getOutput());
	}
	
	@Test
	public void execute() {
		action.getInput().setValue("email", "123");
		action.getInput().setValue("senha", "456");
		action.execute();
	}
	
}

