package cloudapps.tictactoe.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
		assertThat(this.state.getValue(), is("INITIAL"));
	}
	
	@Test
    void testGivenNewStateWhenDoNextAndGetValueStateThenIsInGame() {
		state.next();
		assertThat(this.state.getValue(), is("IN_GAME"));
    }
	
	@Test
    void testGivenNewStateWhenDoTwoNextAndGetValueStateThenIsResume() {
		state.next();
		state.next();
		assertThat(this.state.getValue(), is("RESUME"));
    }
	
	@Test
    public void testGivenNewStateWhenDoThreeNextAndGetValueStateThenIsExit() {

    }
	
	
}
