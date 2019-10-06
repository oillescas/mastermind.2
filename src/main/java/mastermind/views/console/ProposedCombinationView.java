package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.models.Color;
import santaTecla.utils.Console;

/**
 * ProposedCombinationView
 */
public class ProposedCombinationView {

    private Controller controller;
    private int index;

	public ProposedCombinationView(Controller controller, int i) {
        this.controller = controller;
        this.index = i;
	}

	public void write() {
		for (Color color : controller.getConbinationColors(this.index)) {
            new Console().write(color.getInitial());
		}
	}


}
