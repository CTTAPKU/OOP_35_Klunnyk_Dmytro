package src_ex6;

import java.util.concurrent.TimeUnit;
import src_ex3.View;
import src_ex3.ViewResult;
import src_ex5.ConsoleCommand;

public class ExecuteConsoleCommand implements ConsoleCommand {

    private View view;

    public View getView() {
        return view;
    }

    public View setView(View view) {
        return this.view = view;
    }

    public ExecuteConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public int getKey() {
        return 6;
    }

    @Override
    public String toString() {
        return "6. Execute\n";
    }

    @Override
    public void execute() {

        CommandQueue queue1 = new CommandQueue();
        CommandQueue queue2 = new CommandQueue();

        MaxCommand maxCommand = new MaxCommand((ViewResult) view);
        AvgCommand avgCommand = new AvgCommand((ViewResult) view);
        MinCommand minCommand = new MinCommand((ViewResult) view);
        System.out.println("Execute all threads...");
        /**
         * exec1.execute(minMaxCommand); exec2.execute(maxCommand);
         * exec2.execute(avgCommand); /*
         */
        queue1.put(minCommand);
        queue2.put(maxCommand);
        queue2.put(avgCommand);
        /**/
        try {
            while (avgCommand.running()
                    || maxCommand.running()
                    || minCommand.running()) {
                TimeUnit.MILLISECONDS.sleep(100);
            }
            /**
             * exec1.shutdown(); exec2.shutdown(); /*
             */
            queue1.shutdown();
            queue2.shutdown();
            /**/
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        System.out.println("All done.");
    }
}
