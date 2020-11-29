package cloudapps.tictactoe;

import cloudapps.tictactoe.views.console.View;

class ConsoleTicTacToe extends TicTacToe {

	public static void main(String[] args) {
		new ConsoleTicTacToe().play();
	}

	@Override
	protected View createView(){
		return new View();
	}
}
