package src_ex5;

import src_ex3.item;
import java.util.Scanner;

/**
 *
 * @author Klunnyk Dmytro
 */
public class ChangeItemCommand implements Command {

    private item item;

    private String ChangeStr;

    public item setItem(item item) {
        return this.item = item;
    }

    public item getItem() {
        return item;
    }

    public String setChangeStr(String ChangeStr) {
        return this.ChangeStr = ChangeStr;
    }

    public String getChangeStr() {
        return ChangeStr;
    }

    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        setChangeStr(str);
        item.setInString(ChangeStr);
    }
}
