package src_ex3;

import java.util.Scanner;
import java.io.IOException;

/**
 * Виконує визначення та відображення результатів
 * @author Klunnyk Dmytro
 */
public class Main {

    public View view;

    public Main(View view) {
        this.view = view;
    }

    protected void menu() {
        int num;
        do {
            System.out.println("1. Input String \n2. Show \n3. Save \n4. Restore \n5. Quit");
            Scanner in = new Scanner(System.in);
            System.out.print("Input the number: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    view.viewInit();
                    break;
                case 2:
                    view.viewShow();
                    break;
                case 3:
                    try {
                        view.viewSave();
                    } catch (IOException e) {
                    }
                    view.viewShow();
                    break;
                case 4:
                    try {
                        view.viewRestore();
                    } catch (Exception e) {
                    }
                    view.viewShow();
                    break;
                case 5:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("\nWrong command");
            }
        } while (num != 5);
    }

    public static void main(String[] args) {
        Main main = new Main(new ViewableResult().getView());
        main.menu();
    }
}
