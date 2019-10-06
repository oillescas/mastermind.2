package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ProposeController extends Controller{

	public ProposeController(Game game, State state) {
        super(game, state);
	}

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

    public void nextPlay() {
        game.play();
        if(game.isFinished()){
            state.next();
        }
    }

}
