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

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.mentacontainer.Container;
import org.mentacontainer.impl.MentaContainer;
import org.mentawai.db.JPAHandler;
import org.mentawai.util.MockAction;

import com.heliofrota.hurraa.action.LoginAction;
import com.heliofrota.hurraa.business.UsuarioBusiness;
import com.heliofrota.hurraa.business.impl.UsuarioBusinessImpl;
import com.heliofrota.hurraa.persistence.UsuarioPersistence;
import com.heliofrota.hurraa.persistence.impl.UsuarioPersistenceImpl;


/**
 * Classe de teste LoginActionTest.
 *
 * @author helio frota http://www.heliofrota.com
 *
 */
public class LoginActionTest {

	private LoginAction action;
	
	private MockAction mockAction;
	
	private UsuarioBusiness usuarioBusiness;

	@Before
	public void setUp() throws Exception {
		Container container = new MentaContainer();
		container.ioc(EntityManager.class, new JPAHandler("hurraa_test", true));
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

