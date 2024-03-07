package src_ex4;

import src_ex3.ViewableResult;
import src_ex3.View;
/**
 * Оголошує метод що фабрикує об'єкти
 * @author Klunnyk Dmytro
 */
public class ViewableTable extends ViewableResult {
        @Override
        public View getView(){
                return new ViewTable();
        }
        
}
