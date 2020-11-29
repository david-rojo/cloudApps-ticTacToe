package cloudapps.tictactoe.controllers;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import cloudapps.tictactoe.models.Game;
import cloudapps.tictactoe.models.State;

@ExtendWith(MockitoExtension.class)
class PlayControllerTest {
	
	@Mock
    private State state;
	
	@Mock
	private Game game;
	
	@InjectMocks
    private PlayController playController;
	
	@Test
	void testGivenPlayControllerWhenIsTicTacToeThenNextState() {
		when(this.game.isTicTacToe()).thenReturn(true);
		this.playController.isTicTacToe();
	    verify(this.state).next();
	}
}
