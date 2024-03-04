package src;

import java.util.Scanner;
import java.io.IOException;

/**
 * клас для демонстрації в діалоговому режимі збереження та відновлення стану об'єкта, використовуючи серіалізацію.
 * @author Klunnyk Dmytro
 */

public class Main {
    private static Calculate calculate = new Calculate();

    private void imputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        calculate.init(str);
    }

    private void menu() {
        int num;
        do {
            System.out.println("1. Input String \n2. Show \n3. Save \n4. Restore \n5. Quit");
            Scanner in = new Scanner(System.in);
            System.out.print("Input the number: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    imputString();
                    break;
                case 2:
                    calculate.show();
                    break;
                case 3:
                    try {
                        calculate.save();
                    } catch (IOException e) {
                    }
                    calculate.show();
                    break;
                case 4:
                    try {
                        calculate.restore();
                    } catch (Exception e) {
                    }
                    calculate.show();
                    break;
                case 5: 
                     System.out.println("Quit");
                     break;
                default: System.out.println("\nWrong command");
            }
        } while (num != 5);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
}
}
