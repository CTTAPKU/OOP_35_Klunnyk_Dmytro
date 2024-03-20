package src_ex3;

/**
 * Оголошує метод, "фабрикуючий" об'єкти
 * @author Klunnyk Dmytro
 */
public class ViewableResult implements Viewable {

    @Override
    public View getView() {
        return new ViewResult();
    }
}
