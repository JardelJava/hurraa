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
package com.heliofrota.hurraa.action.administracao;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mentacontainer.Container;
import org.mentacontainer.impl.MentaContainer;
import org.mentawai.db.JPAHandler;
import org.mentawai.util.MockAction;

import com.heliofrota.hurraa.action.administracao.FabricantesAction;
import com.heliofrota.hurraa.business.InventarioBusiness;
import com.heliofrota.hurraa.business.impl.InventarioBusinessImpl;
import com.heliofrota.hurraa.entity.inventario.FabricanteTipo;
import com.heliofrota.hurraa.persistence.InventarioPersistence;
import com.heliofrota.hurraa.persistence.impl.InventarioPersistenceImpl;

/**
 * Classe de teste FabricanteActionTest.
 *
 * @author helio frota http://www.heliofrota.com
 *
 */
public class FabricanteActionTest {

    private FabricantesAction action;
    private MockAction mockAction;
    private InventarioBusiness inventarioBusiness;

    @Before
    public void setUp() throws Exception {
        Container container = new MentaContainer();
        container.ioc(EntityManager.class, new JPAHandler("hurraa_test", false));
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

    @Test
    public void addFabricante() {
        action.getInput().setValue("fabricanteNome", "Terminator");
        action.getInput().setValue("fabricanteTipo", FabricanteTipo.HARDWARE);
        action.addFabricante();

        action.getInput().setValue("fabricanteNome", "Cyberdyne");
        action.getInput().setValue("fabricanteTipo", FabricanteTipo.SOFTWARE);
        action.addFabricante();

        action.getInput().setValue("fabricanteNome", "Skynet");
        action.getInput().setValue("fabricanteTipo", FabricanteTipo.HARDWARE_SOFTWARE);
        action.addFabricante();
    }
}
