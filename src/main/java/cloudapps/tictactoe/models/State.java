package cloudapps.tictactoe.models;

public class State {
	
	private String value;
	
	private String[] possibleValues = new String[] {"INITIAL", "IN_GAME", "RESUME"};
	
	private int index;
	
	public State() {
		index = 0;
		value = possibleValues[index];
	}
	
	public void next() {
		index++;
		value = possibleValues[index];
	}
	
	public String getValue() {
		return value;
	}
	
	

}
