package cloudapps.tictactoe.controllers;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;

@ExtendWith(MockitoExtension.class)
class ResumeControllerTest {

	@Mock
    private State state;
	
	@Mock
	private Game game;
	
	@Mock
	private ControllersVisitor controllersVisitor;
	
	@InjectMocks
    private ResumeController resumeController;
	
	@Test
	void testGivenResumeControllerWhenResumeThenReset() {
		this.resumeController.resume();
	    verify(this.state).reset();
	    verify(this.game).reset();	    
	}
	
	@Test
	void testGivenResumeControllerWhenAcceptThenControllersVisitorVisit() {
		this.resumeController.accept(this.controllersVisitor);
		verify(this.controllersVisitor).visit(this.resumeController);
	}
}
