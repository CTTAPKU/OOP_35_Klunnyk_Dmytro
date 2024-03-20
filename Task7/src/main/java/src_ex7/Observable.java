package src_ex7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Klunnyk Dmytro
 */
public class Observable implements Observed{

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String string) {
        for (Observer observer : observers) {
            observer.update(string);
        }
    }
}
