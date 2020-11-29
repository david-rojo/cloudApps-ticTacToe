package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.PlayController;
import cloudapps.tictactoe.models.Coordinate;
import cloudapps.tictactoe.views.Message;
import cloudapps.tictactoe.models.Error;

class PlayView {

   void interact(PlayController playController) {
        do {
            if (!playController.isBoardComplete()) {
                this.put(playController);
            } else {
                this.move(playController);
            }
            new GameView(playController).write();
        } while (!playController.isTicTacToe());
        new TokenView(playController.getToken()).write();
        Message.PLAYER_WIN.writeln();
    }

    private void put(PlayController playController) {
        boolean isUser = playController.isUser();
        Coordinate coordinate;
        Error error;
        do {
            if (isUser) {
                coordinate = new CoordinateView().read(Message.COORDINATE_TO_PUT.toString());
            } else {
                coordinate = new Coordinate();
                coordinate.random();
            }
            error = playController.put(coordinate);
            if (isUser) {
                new ErrorView(error).writeln();
            }
        } while (!error.isNull());
    }

    private void move(PlayController playController) {
        boolean isUser = playController.isUser();
        Coordinate origin;
        Coordinate target;
        Error error;
        do {
            if (isUser) {
                origin = new CoordinateView().read(Message.COORDINATE_TO_REMOVE.toString());
                target = new CoordinateView().read(Message.COORDINATE_TO_MOVE.toString());
            } else {
                origin = new Coordinate();
                origin.random();
                target = new Coordinate();
                target.random();
            }
            error = playController.move(origin, target);
            if (isUser) {
                new ErrorView(error).writeln();
            }
        } while (!error.isNull());
    }

}
