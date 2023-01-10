
//Tworzymy 2 punkty x i y, a następnie wypisujemy 
//je jako współrzędne jak na osi z uzyciem toString.

public class Point
{
     int x;
     int y;
     
     Point(int x, int y) {
         this.x = x;
         this.y = y;
     }
     
     public String toString() {
         return "P(" + x + "," + y + ")";
     }
}
