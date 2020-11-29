package cloudapps.tictactoe.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertNotNull;

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
		assertThat(this.logic.getController(), instanceOf(UseCaseController.class));
	}
	
	@Test
	void testGivenNewLogicWhenGetControllerThenNotNull() {
		assertNotNull(this.logic.getController());
	}

}
