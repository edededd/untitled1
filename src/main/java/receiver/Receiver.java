package receiver;

public class Receiver{

    private Receiver remoteControl;
    private boolean state;

    public Receiver getInstance(){
        if(remoteControl == null){
            remoteControl = new Receiver();
        }
        return remoteControl;
    }
    
    public boolean isOn(){
        return state;
    }
    public void setOn(){
        state = true;
    }

    public void setOf(){
        state = false;
    }


     
}

