package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;

public class ResumeController extends Controller {

  public ResumeController(Game game, State state) {
    super(game, state);
  }

  public void resume() {
    this.game.reset();
  }

}
