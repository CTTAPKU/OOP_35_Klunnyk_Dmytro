package src_ex3;

import java.io.Serializable;
import java.util.Arrays;

/**
 * клас, що серіалізується, для зберігання параметрів і результатів обчислень.
 * @author Klunnyk Dmytro
 */
public class Item2d implements Serializable {

    private String InString;
    
    private int [] result;
    
    private int AllVowels;
    
    private static final long serialVersionUID = 1L;
    
    public Item2d(){
        InString = "";
        result = new int[6];
    }
    
    public Item2d (String InString, int[] result){
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
    
    public Item2d SetStrArr(String InString, int[] result){
        this.InString = InString;
        this.result = result;
        return this;
    }

    public int getAllVowels() {
        return AllVowels;
    }

    public int setAllVowels(int AllVowels) {
        return this.AllVowels = AllVowels;
    }

    
    @Override
    public String toString() {
        return "String = " + InString + "\nVowels = [a, e, i, o, u, y]" + "\nresult = " + Arrays.toString(result);
    }

    
}
