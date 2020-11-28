package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.models.Coordinate;
import cloudapps.tictactoe.models.Error;
import cloudapps.utils.Console;

public class CoordinateView {
	
	private Console console;
	
	public CoordinateView() {
		console = Console.instance();		
	}

    public Coordinate read(String title) {
        Coordinate coordinate;
        Error error;
        do {
			console.writeln(title);
            int row = console.readInt("Row: ") - 1;
            int column = console.readInt("Column: ") - 1;
            coordinate = new Coordinate(row, column);
            error = coordinate.isValid();
            new ErrorView(error).writeln();
        } while (!error.isNull());
        return coordinate;
    }

}