package src;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * клас для знаходження рішення задачі. 
 * @author Klunnyk Dmytro
 */
public class Calculate {

    private static final String FNAME = "Item.bin";
    private item result;

    public Calculate() {
        result = new item();
    }

    public void setResult(item result) {
        this.result = result;
    }

    public item getResult() {
        return result;
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

    public int[] init(String InString) {
        result.setInString(InString);
        return result.setRes(calculate(InString));
    }

    public void show() {
        System.out.println(result);
    }

    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (item) is.readObject();
        is.close();
    }
}
