
public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume
{
    String status="Off";
    int volume= 1;
    int channel = 1;

    public void on(){
        status="On";
    }
    
    public void off(){
        status="Off";
    }
    
    public void volumeUp(){
        if (volume<10 && status == "On"){
            volume+=1;}
    }
    
    public void volumeDown(){
        if (volume>1 && status == "On"){
            volume=-1;}
    }
    
    public void showStatus(){
        System.out.println("Status: " + status+ " Volume: " + volume);
    }
    
    public void channelUp(){
        if (channel<99 && status == "On"){
            channel+=1;}
    }
    
    public void channelDown(){
        if (channel>1 && status == "On"){
            channel-=1;}
    }
    
    public void setChannel (int channel){
        if (status == "On"){
            this.channel=channel;}
    }
    
    public static void main(String [] args){
        TV tv1= new TV();
        tv1.showStatus();
        tv1.on();
        tv1.showStatus();
        for (int i =0; i<6; i++){
            tv1.volumeUp();
        }
        tv1.showStatus();
    }
}
