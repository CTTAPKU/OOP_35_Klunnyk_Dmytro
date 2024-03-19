package src_ex5;

import src_ex3.View;

/**
 *
 * @author Klunnyk Dmytro
 */
public class UndoConsoleCommand implements ConsoleCommand {

    private View view;

    public UndoConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public int getKey() {
        return 6;
    }

    @Override
    public String toString() {
        return "6. Undo\n";
    }

    @Override
    public void execute() {
        System.out.println("Undo current.");
        try {
            UndoCommand und = new UndoCommand(view);
            und.Undo();
        } catch (Exception e) {
            System.err.println("Serialization error: " + e);
        }
        view.viewShow();
    }
}
