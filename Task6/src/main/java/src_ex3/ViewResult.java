package src_ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Обчислення, збереження та відображення результатів
 *
 * @author Klunnyk Dmytro
 */
public class ViewResult implements View {

    private static final String FNAME = "items.bin";

    private static final int DEFAUL_NUM = 5;

    private ArrayList<item> items = new ArrayList<item>();

    public ViewResult() {
        this(DEFAUL_NUM);
    }

    public ViewResult(int n) {
        for (int crt = 0; crt < n; crt++) {
            items.add(new item());
        }
    }

    public ArrayList<item> getItems() {
        return items;
    }

    public int[] calculate(String InString) {
        InString = InString.toLowerCase();
        int[] arr = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < InString.length(); i++) {
            if (InString.charAt(i) == 'a') {
                arr[0]++;
            }
            if (InString.charAt(i) == 'e') {
                arr[1]++;
            }
            if (InString.charAt(i) == 'i') {
                arr[2]++;
            }
            if (InString.charAt(i) == 'o') {
                arr[3]++;
            }
            if (InString.charAt(i) == 'u') {
                arr[4]++;
            }
            if (InString.charAt(i) == 'y') {
                arr[5]++;
            }
        }
        return arr;
    }

    public void init() {
        Scanner in = new Scanner(System.in);
        for (item itm : items) {
            System.out.print("Input the string: ");
            String Str = in.nextLine();
            itm.SetStrArr(Str, calculate(Str));
        }
        CountAllVowel();
    }

    public void CountAllVowel() {
        int AllVowel;
        for (item itm : items) {
            int[] VowelArr = itm.getRes();
            AllVowel = 0;
            for (int i = 0; i < 6; i++) {
                AllVowel += VowelArr[i];
            }
            itm.setAllVowels(AllVowel);
        }
    }

    @Override
    public void viewInit() {
        init();
    }

    @Override
    public void viewSave() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(items);
        os.flush();
        os.close();
    }

    @Override
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        items = (ArrayList<item>) is.readObject();
        is.close();
    }

    @Override
    public void viewHeader() {
        System.out.println("Results:");
    }

    @Override
    public void viewBody() {
        for (item itm : items) {
            System.out.println("String = " + itm.getInString() + "\nVowels = [a, e, i, o, u, y]" + "\nresult = " + Arrays.toString(itm.getRes()) + "\n____________________________");
        }
        System.out.println();
    }

    @Override
    public void viewFooter() {
        System.out.println("End.");
    }

    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }
}
