package cloudapps.tictactoe.models;

public class State {
	
	private StateValue stateValue;
	
	private String[] possibleValues = new String[] {"INITIAL", "IN_GAME", "RESUME", "EXIT"};
	
	private int index;
	
	public State() {
		index = 0;
		stateValue = StateValue.INITIAL;
	}
	
	public void next() {
		index++;
		stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
	}
	
	public StateValue getStateValue() {
		return stateValue;
	}
	
	

}
