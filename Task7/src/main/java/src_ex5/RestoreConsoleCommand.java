package src_ex5;

import src_ex3.View;

/**
 *
 * @author Klunnyk Dmytro
 */
public class RestoreConsoleCommand implements ConsoleCommand {

    private View view;

    public RestoreConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public int getKey() {
        return 4;
    }

    @Override
    public String toString() {
        return "4. Restore\n";
    }

    @Override
    public void execute() {
        System.out.println("Restore last saved.");
        try {
            view.viewRestore();
        } catch (Exception e) {
            System.err.println("Serialization error: " + e);
        }
        view.viewShow();
    }
}
