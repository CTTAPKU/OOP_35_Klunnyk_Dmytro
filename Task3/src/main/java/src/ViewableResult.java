package src;

/**
 * Оголошує метод, "фабрикуючий" об'єкти
 * @author Klunnyk Dmytro
 */
public class ViewableResult implements Viewable {

    public View getView() {
        return new ViewResult();
    }
}
