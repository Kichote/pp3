//Punkt 17

public class StudentGrades
{
    String studentName;
    double[] grades;
    double lowest;
    double highest;
    int numberOfGrades;
    double mean;
    
    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    void lowestGrade() {
        lowest = grades[0];
        for (double i: grades) {
            if (i < lowest) {
                lowest = i;
            }
        }
    }
    
    void highestGrade() {
        highest = 0;
        for (double i : grades) {
            if (i > highest) {
                highest = i;
            }
        }
    }
    
    void numberOfGrades() {
        numberOfGrades = grades.length;
    }
    
    void gradePointAverage() {
        double sum = 0;
        for (double i : grades) {
            sum += i;
        }
        mean = sum/grades.length;
    }
    
    void display() {
        System.out.println("Name: "+studentName);
        System.out.print("List of Grades: ");
        for (double i : grades){
            System.out.print(i + " ");
        };
        System.out.println("Number of Grades: " + numberOfGrades);
        System.out.println("Lowest grade: "+lowest+ " Highest Grade: " + highest);
        System.out.println("Grade point average: "+mean);
    }
}
