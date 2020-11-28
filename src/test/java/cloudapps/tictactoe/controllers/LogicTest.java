package cloudapps.tictactoe.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogicTest {
	
	private Logic logic;
	
	@BeforeEach
	public void setup() {
		logic = new Logic();
	}
	
	@Test
	void testGivenNewLogicWhenGetControllerThenController() {
		assertThat(this.logic.getController(), instanceOf(Controller.class));
	}

}
