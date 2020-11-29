package cloudapps.tictactoe.views.console;

import cloudapps.tictactoe.controllers.ResumeController;
import cloudapps.tictactoe.views.Message;
import cloudapps.utils.YesNoDialog;

class ResumeView {

	boolean interact(ResumeController resumeController) {
		boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
		if (isResumed){
			resumeController.resume();
		}
		return isResumed;
	}

}
