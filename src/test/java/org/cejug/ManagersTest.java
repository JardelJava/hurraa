package org.cejug;

import org.junit.Test;

/**
 * Test class ManagersTest.
 *
 * @author helio frota
 *
 */
public class ManagersTest {

	@Test
	public void appManagerTest() {
		new AppManager();
	}
	
	@Test
    public void configManagerTest() {
        ConfigManager configManager = new ConfigManager();
        configManager.init();
        configManager.createJPAHandler();
        configManager.loadFilters();
        configManager.setupIoC();
    }
	
	@Test
	public void administracaoManagerTest() {
		AdministracaoManager manager = new AdministracaoManager();
		manager.loadActions();
	}

}
