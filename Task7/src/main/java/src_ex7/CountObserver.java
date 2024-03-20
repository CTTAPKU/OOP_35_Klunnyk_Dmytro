package src_ex7;

import java.util.Arrays;
import javax.swing.JLabel;
import src_ex3.ViewResult;

/**
 *
 * @author Klunnyk Dmytro
 */
public class CountObserver implements Observer {  
    
    private final JLabel outputLabel;
    
    public CountObserver(JLabel outputLabel) {
        this.outputLabel = outputLabel;
    }
    
    @Override
    public void update(String string){
        ViewResult view = new ViewResult();
        int[] arr = view.calculate(string);
        outputLabel.setText(Arrays.toString(arr));
    }
}
