package src_ex5;

import src_ex3.Item2d;
import src_ex3.View;
import src_ex3.ViewResult;

/**
 *
 * @author Klunnyk Dmytro
 */
public class ChangeConsoleCommand extends ChangeItemCommand implements ConsoleCommand {

    private View view;

    public View getView() {
        return view;
    }

    public View setView(View view) {
        return this.view = view;
    }

    public ChangeConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public int getKey() {
        return 5;
    }

    @Override
    public String toString() {
        return "5. Change\n";
    }

    @Override
    public void execute() {
        System.out.println("Change item in: ");
        for (Item2d itm : ((ViewResult) view).getItems()) {
            super.setItem(itm);
            super.execute();
        }
        view.viewShow();
    }
}
