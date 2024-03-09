package src_ex6;

import java.util.concurrent.TimeUnit;
import src_ex3.item;
import src_ex3.ViewResult;
import src_ex5.Command;

public class AvgCommand implements Command {

    private int result = 0;

    private int progress = 0;

    private ViewResult viewResult;

    public ViewResult getViewResult() {
        return viewResult;
    }

    public ViewResult setViewResult(ViewResult viewResult) {
        return this.viewResult = viewResult;
    }

    public AvgCommand(ViewResult viewResult) {
        this.viewResult = viewResult;
    }

    public double getResult() {
        return result;
    }

    public boolean running() {
        return progress < 100;
    }

    @Override
    public void execute() {
        progress = 0;
        System.out.println("Average executed...");
        result = 0;
        int idx = 1, size = viewResult.getItems().size();
        for (item item : viewResult.getItems()) {
            result += item.getAllVowels();
            progress = idx * 100 / size;

            if (idx++ % (size / 2) == 0) {
                System.out.println("Average " + progress + "%");
            }
            try {
                TimeUnit.MILLISECONDS.sleep(2000 / size);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        result /= size;
        System.out.println("Average done. Result = " + result);
        progress = 100;
    }
}
