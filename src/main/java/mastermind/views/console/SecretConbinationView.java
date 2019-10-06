package mastermind.views.console;

import mastermind.controllers.Controller;
import santaTecla.utils.WithConsoleModel;

/**
 * SecretConbinationView
 */
public class SecretConbinationView extends WithConsoleModel {

    private Controller controller;

    public SecretConbinationView(Controller controller) {
        this.controller = controller;
    }

    public void writeln() {
        for (int i = 0; i < controller.getSecretSize(); i++) {
            Message.SECRET.write();
        }
        Message.NEW_LINE.write();

    }

}
