package src_ex6;

import src_ex5.Command;

public interface Queue {

    void put(Command cmd);

    Command take();
}
