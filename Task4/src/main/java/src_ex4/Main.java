package src_ex4;

import src_ex3.View;
/**
 *Виконує визначення та відображення результатів
 * @author Klunnyk Dmytro
 */
public class Main extends src_ex3.Main {
    public Main(View view){
        super(view);
    }
    
    public static void main(String[] args) {
        Main main = new Main(new ViewableTable().getView());
        main.menu();
    }
}
