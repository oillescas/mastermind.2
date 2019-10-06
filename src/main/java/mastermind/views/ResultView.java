package mastermind.views;

import mastermind.controllers.Controller;
import mastermind.models.Result;

/**
 * ResultView
 */
public class ResultView {

    private Controller controller;
    private int index;

	public ResultView(Controller controller, int i) {
        this.controller = controller;
        this.index = i;
	}

	public void writeln() {
        Result result = controller.getResult(index);
		Message.RESULT.writeln(result.getBlacks(), result.getWhites());
	}



}
