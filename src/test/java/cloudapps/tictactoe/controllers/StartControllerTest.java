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
class StartControllerTest {
	
	@Mock
    private State state;
	
	@Mock
	private Game game;
	
	@Mock
	private ControllersVisitor controllersVisitor;
	
	@InjectMocks
    private StartController startController;
		
	@Test
	void testGivenStartControllerWhenNextThenNextState() {
		this.startController.start();
	    verify(this.state).next();
	}
	
	@Test
	void testGivenStartControllerWhenAcceptThenControllersVisitorVisit() {
		this.startController.accept(this.controllersVisitor);
		verify(this.controllersVisitor).visit(this.startController);
	}

}
