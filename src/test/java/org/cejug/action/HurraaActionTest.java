package org.cejug.action;

import org.junit.Before;
import org.junit.Test;
import org.mentawai.util.MockAction;


/**
 * Classe de teste HurraaActionTest.
 *
 * @author helio frota
 *
 */
public class HurraaActionTest {

	private HurraaAction action;
	
	private MockAction mockAction;
	
	@Before
	public void setUp() throws Exception {
		action = new HurraaAction();
		mockAction = new MockAction(action);
		action.setInput(mockAction.getInput());
		action.setOutput(mockAction.getOutput());
	}
	
	@Test
	public void execute() {
		action.execute();
	}
	
}

