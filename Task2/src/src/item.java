package src;

import java.io.Serializable;
import java.util.Arrays;

/**
 * клас, що серіалізується, для зберігання параметрів і результатів обчислень.
 * @author Klunnyk Dmytro
 */
public class item implements Serializable {

    private String InString;
    private int [] result;
    
    private static final long serialVersionUID = 1L;
    
    public item(){
        InString = "Hello";
        result = new int[6];
    }
    
    public item (String InString, int[] result){
        this.InString = InString;
        this.result = result;
    }

    public String getInString() {
        return InString;
    }

    public int[] getRes() {
        return result;
    }

    public void setInString(String InString) {
        this.InString = InString;
    }

    public int [] setRes(int[] result) {
        return this.result = result;
    }

    @Override
    public String toString() {
        return "String = " + InString + "\nVowels = [a, e, i, o, u, y]" + "\nresult = " + Arrays.toString(result);
    }

    
}
