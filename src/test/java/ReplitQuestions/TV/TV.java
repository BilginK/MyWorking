package ReplitQuestions.TV;

public class TV {

    private int channel=1;
    private int volumeLevel=0;
    private boolean on = false;
    private String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");

    }
    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setChannel(int channel) {
        if(isOn() && (channel>0 && channel<=120)){
            this.channel=channel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void setVolumeLevel(int volumeLevel) {

        if(isOn()&& (volumeLevel>0 && volumeLevel<7)){
            this.volumeLevel = volumeLevel;

        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        if (channel>0 && channel<120) {
            channel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }

    public void channelDown(){
        if (channel>1 && channel<120) {
            channel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }

    }
    public void volumeUp() {

        if (isOn() && volumeLevel<7) {
            volumeLevel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public void volumeDown(){
        if (isOn() && volumeLevel>0) {
            volumeLevel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");

        }
    }
    public boolean isOn() {
        return on;
    }
    public void turnOn(){
        if (isOn()){
            System.out.println("TV is already ON");
        }else{
            on = true;
        }

    }
    public void turnOff(){
        if(!isOn()){
            System.out.println("TV is already OFF");
        }else{
            on = false;
        }

    }
}