package cloudapps.tictactoe.models;

public class State {
	
	private StateValue stateValue;
	
	public State() {
		this.reset();
	}
	
	private void reset() {
		this.stateValue = StateValue.INITIAL;
	}
	
	public void next() {
		this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
	}
	
	public StateValue getStateValue() {
		return stateValue;
	}

}
