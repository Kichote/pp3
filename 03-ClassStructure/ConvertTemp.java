//Punkt 14

public class ConvertTemp
{
   double celsius;
   double fahrenheit;
   double kelwin;
   double CTK;
   double CTF;
   double KTC;
   double KTF;
   double FTC;
   double FTK;
   
   ConvertTemp(double celsius, double fahrenheit, double kelwin) {
       this.celsius = celsius;
       this.fahrenheit = fahrenheit;
       this.kelwin = kelwin;
   }
   
   double CelsiusToKelwin() {
       CTK = celsius + 273.15;
       return CTK;
   }
   
   double CelsiusToFahrenheit() {
       CTF =  celsius*1.8 + 32.0;
       return CTF;
   }
   
   double KelwinToCelsius() {
       KTC = kelwin - 273.15;
       return KTC;
   }
   
   double KelwinToFahrenheit() {
       KTF = (kelwin -273.15)*1.8 + 32.0;
       return KTF;
   }
   
   double FahrenheitToCelsius() {
       FTC = (fahrenheit - 32.0)/1.8;
       return FTC;
   }
   
   double FahrenheitToKelwin() {
       FTK = (fahrenheit - 32.0)/1.8 + 273.15;
       return FTK;
   }
   
   void displayTempFromCelsiusToOther() {
       System.out.println("Your Celsius: " + celsius + ". And converted temperature:");
       System.out.println("Temperature in Kelwin: "+ CTK);
       System.out.println("Temperature in Fahrenheit: " + CTF);
   }
   
   void displayTempFromFahrenheitToOther() {
       System.out.println("Your Fahrenheit: " + fahrenheit + ". And converted temperature:");
       System.out.println("Temperature in Kelwin: "+ FTK);
       System.out.println("Temperature in Celsius: " + FTC);
   }
   
   void displayTempFromKelwinToOther() {
       System.out.println("Your Kelwin: " + kelwin + ". And converted temperature:");
       System.out.println("Temperature in Celsius: "+ KTC);
       System.out.println("Temperature in Fahrenheit: " + KTF);
   }
}
