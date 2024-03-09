package src_ex3;

import java.io.IOException;
/**
 * Інтерфейс фабрикуємих об'єктів. Оголошує методи відображення об'єктів
 * @author Klunnyk Dmytro
 */
public interface View {

    public void viewHeader();

    public void viewBody();

    public void viewFooter();

    public void viewShow();

    public void viewInit();

    public void viewSave() throws IOException;

    public void viewRestore() throws Exception;

}
