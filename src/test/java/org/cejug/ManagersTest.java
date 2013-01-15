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
    public void configManagerTest() {
        ConfigManager configManager = new ConfigManager();
        configManager.loadFilters();
    }

}
