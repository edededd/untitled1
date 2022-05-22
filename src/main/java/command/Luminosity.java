package command;
import receiver.Receiver;
import java.util.logging.Logger;
public class Luminosity implements Command{
    private double lum;
    private Receiver receiver;
    Logger logger = Logger.getLogger(Luminosity.class.getName());
    public Luminosity(Receiver r, double l){
        this.lum = l;
        this.receiver = r;
    }
    @Override
    public void execute(){
         String s= "la nueva luminosidad es: "+lum;
         logger.info(s);
    }
}
