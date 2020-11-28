package cloudapps.tictactoe.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StateTest {

	private State state;
	
	@BeforeEach
	public void setup() {
		state = new State();
	}
	
	@Test
	void testGivenNewStateWhenGetValueStateThenIsInitial() {
		
	}
	
	@Test
    void testGivenNewStateWhenDoNextAndGetValueStateThenIsInGame() {
     
    }
	
	@Test
    void testGivenNewStateWhenDoTwoNextAndGetValueStateThenIsResult() {

    }
	
	@Test
    public void testGivenNewStateWhenDoThreeNextAndGetValueStateThenIsExit() {

    }
	
	
}
