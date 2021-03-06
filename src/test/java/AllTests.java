/*
 *   Hurraa http://github.com/heliofrota/hurraa
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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.heliofrota.hurraa.ManagersTest;
import com.heliofrota.hurraa.action.HurraaActionTest;
import com.heliofrota.hurraa.action.LoginActionTest;
import com.heliofrota.hurraa.action.administracao.FabricanteActionTest;

/**
 * Test class AllTests.
 *
 * @author helio frota http://www.heliofrota.com
 *
 */
@RunWith(value = Suite.class)
@SuiteClasses(value = {
	ManagersTest.class,
	FabricanteActionTest.class,
	HurraaActionTest.class,
	LoginActionTest.class
})
public class AllTests {

}
