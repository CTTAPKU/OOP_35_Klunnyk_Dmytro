package src_ex5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import src_ex3.item;
import src_ex3.View;

/**
 *
 * @author Klunnuk Dmytro
 */
public class UndoCommand {

    private static final String UNAME = "undo.bin";

    private ArrayList<item> items;

    private View view;

    public UndoCommand(View view) {
        this.view = view;
    }

    public void Undo() throws IOException, Exception{
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(UNAME));
        items = (ArrayList<item>) is.readObject();
        is.close();
    }

}
