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
		assertThat(this.state.getStateValue(), is(StateValue.INITIAL));
	}
	
	@Test
    void testGivenNewStateWhenDoNextAndGetValueStateThenIsInGame() {
		state.next();
		assertThat(this.state.getStateValue(), is(StateValue.IN_GAME));
    }
	
	@Test
    void testGivenNewStateWhenDoTwoNextAndGetValueStateThenIsResume() {
		state.next();
		state.next();
		assertThat(this.state.getStateValue(), is(StateValue.RESUME));
    }
	
	@Test
    void testGivenNewStateWhenDoThreeNextAndGetValueStateThenIsExit() {
		state.next();
		state.next();
		state.next();
		assertThat(this.state.getStateValue(), is(StateValue.EXIT));
    }	
	
}
