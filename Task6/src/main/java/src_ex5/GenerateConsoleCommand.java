package src_ex5;

import src_ex3.View;

/**
 *
 * @author Klunnyk Dmytro
 */
public class GenerateConsoleCommand implements ConsoleCommand {

    private View view;

    public GenerateConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public int getKey() {
        return 1;
    }

    @Override
    public String toString() {
        return "1. Input String\n";
    }

    @Override
    public void execute() {
        view.viewInit();
        view.viewShow();
    }
}
