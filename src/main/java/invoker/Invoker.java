package invoker;
import command.Command;

public class Invoker {
    private Command command;
  
    public Invoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
//a
