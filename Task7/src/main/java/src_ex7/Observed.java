package src_ex7;

/**
 *
 * @author Klunnyk Dmytro
 */
public interface Observed {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String string);
}
