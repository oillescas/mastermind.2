package mastermind.controllers;

import java.util.List;

import mastermind.models.Color;
import mastermind.models.Game;
import mastermind.models.Result;
import mastermind.models.State;

public abstract class Controller {

    protected Game game;

    protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public abstract void accept(ControllerVisitor controllerVisitor);

	public int getAttemps() {
		return this.game.getAttemps();
    }

    public int getSecretSize() {
        return this.game.getSecretSize();
    }

	public List<Color> getConbinationColors(int index) {
		return this.game.getConbinationColors(index);
	}

	public Result getResult(int index) {
		return this.game.getResult(index);
	}

}
