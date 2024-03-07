package src_ex5;

import src_ex3.View;
import src_ex4.ViewableTable;

/**
 *
 * @author Klunnyk Dmytro
 */
public class Application {

    private static Application instance = new Application();

    private Application() {
    }

    public static Application getInstance() {
        return instance;
    }

    private View view = new ViewableTable().getView();

    private Menu menu = new Menu();

    public void run() {
        menu.add(new GenerateConsoleCommand(view));
        menu.add(new ViewConsoleCommand(view));
        menu.add(new SaveConsoleCommand(view));
        menu.add(new RestoreConsoleCommand(view));
        menu.add(new ChangeConsoleCommand(view));
        menu.execute();
    }
}
