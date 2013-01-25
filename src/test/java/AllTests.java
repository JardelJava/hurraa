import org.cejug.ManagersTest;
import org.cejug.action.HurraaActionTest;
import org.cejug.action.LoginActionTest;
import org.cejug.action.administracao.FabricanteActionTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test class AllTests.
 *
 * @author helio frota
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
