package cloudapps.tictactoe.models;

public class State {
	
	private StateValue stateValue;
	
	public State() {
		stateValue = StateValue.INITIAL;
	}
	
	public void next() {
		stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
	}
	
	public StateValue getStateValue() {
		return stateValue;
	}
	
	

}
