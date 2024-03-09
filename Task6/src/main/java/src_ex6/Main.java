package src_ex6;

import src_ex3.View;
import src_ex3.ViewableResult;
import src_ex5.ChangeConsoleCommand;
import src_ex5.GenerateConsoleCommand;
import src_ex5.Menu;
import src_ex5.ViewConsoleCommand;

public class Main {

    private View view = new ViewableResult().getView();

    private Menu menu = new Menu();

    public void run() {
        menu.add(new GenerateConsoleCommand(view));
        menu.add(new ViewConsoleCommand(view));
        menu.add(new ChangeConsoleCommand(view));
        menu.add(new ExecuteConsoleCommand(view));
        menu.execute();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
