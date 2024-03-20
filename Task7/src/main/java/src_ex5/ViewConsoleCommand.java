package src_ex5;

import src_ex3.View;
/**
 *
 * @author Klunnyk Dmytro
 */
public class ViewConsoleCommand implements ConsoleCommand {
       private View view;
       public ViewConsoleCommand(View view){
           this.view = view;
       }
       
       @Override
       public int getKey(){
           return 2;
       }
       
       @Override
       public String toString(){
           return "2. Show\n";
       }
       
       @Override
       public void execute(){
           System.out.println();
           view.viewShow();
       }
}
