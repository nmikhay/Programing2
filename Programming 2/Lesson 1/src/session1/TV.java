package session1;

public class TV {
    int channel = 1;
    int volumeLvl = 1;
    boolean on = false;

    public TV(){
    }

    public TV(int newChannel){
        channel = newChannel;
    }
    //use this to call a data field of a class
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }

}
