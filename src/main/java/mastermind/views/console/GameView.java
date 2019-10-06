package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.views.console.Message;
import mastermind.views.console.ProposedCombinationView;
import mastermind.views.console.ResultView;
import mastermind.views.console.SecretConbinationView;
import santaTecla.utils.WithConsoleModel;

public class GameView  extends WithConsoleModel{
    private final Controller controller;

    public GameView(Controller controller) {
        this.controller = controller;
    }

    public void writeln() {
		this.console.writeln();
        Message.ATTEMPTS.writeln(this.controller.getAttemps());
        new SecretConbinationView(controller).writeln();
        for (int i = 0; i < controller.getAttemps(); i++) {
            new ProposedCombinationView(controller, i).write();
            new ResultView(controller, i).writeln();
		}
	}
}
