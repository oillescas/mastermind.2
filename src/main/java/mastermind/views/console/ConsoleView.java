package mastermind.views.console;

// import mastermind.Message;
import mastermind.controllers.Controller;
import mastermind.controllers.ProposeController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;
import santaTecla.utils.YesNoDialog;

public class ConsoleView extends View {

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startController.start();
        //new GameView(startController).writeln();
    }

    @Override
    public void visit(ProposeController proposeController) {
        proposeController.nextPlay();
        new GameView(proposeController).writeln();
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read());
    }
}
