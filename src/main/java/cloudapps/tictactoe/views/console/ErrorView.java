package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.models.Error;
import cloudapps.utils.Console;

class ErrorView extends cloudapps.tictactoe.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	void writeln() {
		if (!error.isNull()){
			Console.instance().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
		}
	}

}
