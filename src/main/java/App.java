import receiver.Receiver;
import command.Command;
import command.Luminosity;
import invoker.Invoker;
public class App{
    public static void main(String args[]){
        Receiver receiver = new Receiver();
        Command lum = new Luminosity(receiver,20);
        Invoker inv = new Invoker(lum);
        inv.execute(); 
        lum = new Luminosity(receiver,40);
        inv = new Invoker(lum);
        inv.execute();    
    }

    
}
