import org.cejug.ManagersTest;
import org.cejug.action.HurraaAction;
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
	HurraaAction.class,
})
public class AllTests {

}
