package src_ex5;

import src_ex3.Item2d;
import java.util.Scanner;

/**
 *
 * @author Klunnyk Dmytro
 */
public class ChangeItemCommand implements Command {

    private Item2d item;

    private String ChangeStr;

    public Item2d setItem(Item2d item) {
        return this.item = item;
    }

    public Item2d getItem() {
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
