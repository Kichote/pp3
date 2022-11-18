//Punkt 20

public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock() {
        hour = 0;
        minute = 0;
    }
    
    Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    void setClock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    void setClock() {
        hour = 0;
        minute = 0;
    }
    
    void displayTime() {
        System.out.println("It is: " + hour + ":" + minute + ".");
    }
    
    void addOneMinute() {
        if (minute <= 58) {
            minute += 1;
        }else if (minute == 59 && hour < 23) {
            hour += 1;
            minute = 0;
        }else if (minute == 59 && hour == 23) {
            hour = 0;
            minute = 0;
        }
    }
    //Punkt 21
    void setAlarm(int hour, int minute) {
        this.alarmHour = hour;
        this.alarmMinute = minute;
    }
    
    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }
}
