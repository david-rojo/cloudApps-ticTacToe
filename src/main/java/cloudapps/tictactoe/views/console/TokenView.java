package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.models.Token;
import cloudapps.utils.Console;

public class TokenView {

	public static final char[] SYMBOLS = {'X', 'O', ' ' };
	private Token token;

	TokenView(Token token){
		this.token = token;
	}

	void write() {
		Console.instance().write(TokenView.SYMBOLS[token.ordinal()]);
	}

}