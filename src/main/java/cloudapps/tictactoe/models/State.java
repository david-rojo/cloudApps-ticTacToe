package cloudapps.tictactoe.models;

public class State {
	
	private StateValue value;
	
	private String[] possibleValues = new String[] {"INITIAL", "IN_GAME", "RESUME", "EXIT"};
	
	private int index;
	
	public State() {
		index = 0;
		value = StateValue.INITIAL;
	}
	
	public void next() {
		index++;
		value = StateValue.values()[this.value.ordinal() + 1];
	}
	
	public StateValue getValue() {
		return value;
	}
	
	

}
