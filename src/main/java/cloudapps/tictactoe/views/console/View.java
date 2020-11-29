package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.ControllersVisitor;
import cloudapps.tictactoe.controllers.PlayController;
import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.controllers.StartController;
import cloudapps.tictactoe.controllers.UseCaseController;

public class View extends cloudapps.tictactoe.views.View implements ControllersVisitor {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View() {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
	}

	@Override
	public void interact(UseCaseController controller) {
		if (controller instanceof StartController) {
			this.startView.interact((StartController) controller);
		} else if (controller instanceof PlayController) {
			this.playView.interact((PlayController) controller);
		} else {
			this.resumeView.interact((ResumeController) controller);
		}
	}

	@Override
	public void visit(StartController startController) {
		
	}

	@Override
	public void visit(PlayController playController) {
		
	}

	@Override
	public void visit(ResumeController resumeController) {
		
	}

}
