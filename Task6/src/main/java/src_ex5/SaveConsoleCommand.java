package src_ex5;

import java.io.IOException;
import src_ex3.View;

/**
 *
 * @author Klunnyk Dmytro
 */
public class SaveConsoleCommand implements ConsoleCommand {

    private View view;

    public SaveConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public int getKey() {
        return 3;
    }

    @Override
    public String toString() {
        return "3. Save\n";
    }

    @Override
    public void execute() {
        System.out.println("Save current.");
        try {
            view.viewSave();
        } catch (IOException e) {
            System.err.println("Serialization error: " + e);
        }
        view.viewShow();
    }
}
