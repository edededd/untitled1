package command;
import receiver.Receiver;
import java.util.logging.Logger;
public class Luminosity implements Command{
    private double luminosity;
    private Receiver receiver;
    Logger logger = Logger.getLogger(Luminosity.class.getName());
    public Luminosity(Receiver r, double l){
        this.luminosity = l;
        this.receiver = r;
    }
    @Override
    public void execute(){
         logger.info("la nueva luminosidad es: "+luminosity);
    }
}
