public class Time_1
{
    public static void main(String[] args) {
        int hour = 20;
        int minute = 23;
        int second = 13;
        
        //Make the program calculate and display the number of seconds since midnight.
        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour*60*60) + (minute * 60) + second);
        
        //Calculate and display the number of seconds remaining in the day.
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println((24*60*60) - ((hour*60*60) + (minute * 60) + second));
        
        //Calculate and display the percentage of the day that has passed.
        double hour1 = 20.0;
        double minute1 = 13.0;
        double second1 = 13.0;
        
        System.out.println(((hour1*60*60) + (minute1 * 60) + second1) * 100 / (24.0*60.0*60.0 ));
        
        hour = 20;
        minute = 34;
        second = 57;
        
        //Then write code to compute the elapsed time since you started working on this exercise.
        System.out.print("Elapsed time since start of this exercise in seconds: ");
        System.out.println(((hour*60*60) + (minute * 60) + second) - ((hour1*60*60) + (minute1 * 60) + second1));
        
    }
}
