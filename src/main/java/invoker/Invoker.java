package invoker;
import command.Command;

public class Invoker {
    private Command command;
    private double in;
  
    public Invoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
//a
