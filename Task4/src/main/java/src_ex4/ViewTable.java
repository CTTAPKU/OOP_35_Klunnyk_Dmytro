package src_ex4;

import java.util.Arrays;
import java.util.Formatter;
import src_ex3.item;
import src_ex3.ViewResult;

/**
 *Відображення у вигляді таблиці
 * @author Klunnyk Dmytro
 */
public class ViewTable extends ViewResult {

    private static final int DEFAULT_WIDTH = 40;

    private int width;

    public ViewTable() {
        width = DEFAULT_WIDTH;
    }

    public ViewTable(int width) {
        this.width = width;
    }

    public ViewTable(int width, int n) {
        super(n);
        this.width = width;
    }

    public int setWidth(int width) {
        return this.width = width;
    }

    public int getWidth() {
        return width;
    }

    private void outLine() {
        for (int i = width; i > 0; i--) {
            System.out.print('-');
        }
    }

    private void outLineLn() {
        outLine();
        System.out.println();
    }

    private void outHeader() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width - 3) / 2, "s | %", "s\n");
        System.out.printf(fmt.toString(), "String", "[a, e, i, o, u, y]");
    }

    private void outBody() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width - 3) / 2, "s | %", "s\n");
        for (item itm : getItems()) {
            System.out.printf(fmt.toString(), itm.getInString(), Arrays.toString(itm.getRes()));
        }
    }

    public final void init(int width) {
        this.width = width;
        viewInit();
    }

    @Override
    public void init() { 
        System.out.println("Initialization... ");
        super.init();
        System.out.println("done. ");
    }

    @Override
    public void viewHeader() {
        outHeader();
        outLineLn();
    }

    @Override
    public void viewBody() {
        outBody();
    }

    @Override
    public void viewFooter() {
        outLineLn();
    }
}
