package org.cejug.action.administracao;

import javax.persistence.EntityManager;

import org.cejug.business.InventarioBusiness;
import org.cejug.business.impl.InventarioBusinessImpl;
import org.cejug.persistence.InventarioPersistence;
import org.cejug.persistence.impl.InventarioPersistenceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mentacontainer.Container;
import org.mentacontainer.impl.MentaContainer;
import org.mentawai.db.JPAHandler;
import org.mentawai.util.MockAction;

/**
 * Classe de teste FabricanteActionTest.
 *
 * @author helio frota
 *
 */
public class FabricanteActionTest {

	private FabricantesAction action;
	
	private MockAction mockAction;
	
	private InventarioBusiness inventarioBusiness;

	
	@Before
	public void setUp() throws Exception {
		Container container = new MentaContainer();
		container.ioc(EntityManager.class, new JPAHandler("hurraa", true));
		container.ioc(InventarioPersistence.class, InventarioPersistenceImpl.class).addConstructorDependency(EntityManager.class);
		container.ioc(InventarioBusiness.class, InventarioBusinessImpl.class).addConstructorDependency(InventarioPersistence.class);
		
		inventarioBusiness = container.get(InventarioBusiness.class);
		
		action = new FabricantesAction(inventarioBusiness);
		mockAction = new MockAction(action);
		action.setInput(mockAction.getInput());
		action.setOutput(mockAction.getOutput());
	}
	
	@Test
	public void execute() {
		action.execute();
	}
	
	@Test
	public void getFabricantes() {
		action.getInput().setValue("inicio", 0);
		action.getInput().setValue("limite", 10);
		action.getFabricantes();
	}
}
