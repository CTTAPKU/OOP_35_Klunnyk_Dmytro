package src_ex5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Klunnyk Dmytro
 */
public class Menu implements Command {

    private List<ConsoleCommand> menu = new ArrayList<ConsoleCommand>();

    public ConsoleCommand add(ConsoleCommand command) {
        menu.add(command);
        return command;
    }

    @Override
    public String toString() {
        String s = "Enter command...\n";
        for (ConsoleCommand c : menu) {
            s += c;
        }
        s += "6. Quit: ";
        return s;
    }

    @Override
    public void execute() {
        int num = 0;
        Scanner in = new Scanner(System.in);
        menu:
        while (true) {
            do {
                System.out.print(this);
                try {
                    num = in.nextInt();
                } catch (Exception e) {
                    System.err.println("Error: " + e);
                    System.exit(0);
                }
            } while (num < 1 && num > 6);
            if (num == 6) {
                System.out.println("Exit.");
                break menu;
            }
            for (ConsoleCommand c : menu) {
                if (num == c.getKey()) {
                    c.execute();
                    continue menu;
                }
            }
            System.out.println("Wrong command.");
            continue menu;
        }
    }
}
