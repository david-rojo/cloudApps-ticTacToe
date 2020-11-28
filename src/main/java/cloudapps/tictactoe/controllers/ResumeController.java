package cloudapps.tictactoe.controllers;

import cloudapps.tictactoe.models.Game;

public class ResumeController extends Controller {

  public ResumeController(Game game) {
    super(game);
  }

  public void resume() {
    this.game.reset();
  }

}
