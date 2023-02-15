package Org.stepdefination;

import Org.base.Baseclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends Baseclass{

	
	@Before
	private void precondition(){
		launchbrowser();
		windowMaximize();
	}
	
	@After
	private void postcondition() {
		closeEntirebrowser();
	}
	
}
