//Punkt 15

public class Calculation
{
    int range1;
    int range2;
    int numOfItems;
    int sum;
    float mean;
    
    int numberOfItemsInRange() {
        numOfItems = range2 - range1 +1;
        return numOfItems;
    }
    
    int sumOfNumbersInRange() {
        for (int i = range1; i <=range2; i++) {
            sum += i;
        }
        return sum;
    }
    
    float mean() {
        float num = range2-range1+1;
        mean = sum/num;
        return mean;
    }
    
    void display() {
        System.out.println("Number of items within the specified range: " + numOfItems);
        System.out.println("Sum of numbers in the given range: " + sum);
        System.out.println("Arithmetic mean of the numbers in the given range: " + mean);
    }
}
