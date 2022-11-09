public class Student
{
    String name ;
    String studentIdCard ;
    boolean isIdValid ;
    int semesterNumber ;
    float averageGrade;
    int age ;
    
    //method which says Hello
    void sayHello() {
        System.out.println("Hello"); 
    }
    
    //method displaying name
    void displayName() {
        System.out.println(name);
    }
    
    //method displaying age
    void displayAge() {
        System.out.println(age);
    }
    
    //method displaying name, semester number and average grade
    void displayAll() {
        System.out.println(name);
        System.out.println(semesterNumber);
        System.out.println(averageGrade);
    }
    
    //method to change status of student's ID
    void changeStatus() {
        if (isIdValid == true) {
            isIdValid = false;
        }
        else isIdValid = true;   
        }

    //method displaying student's name, their ID number and wheter their ID is valid
    void displayId() {
        System.out.print(name + " ");
        System.out.print(studentIdCard + " ");
        System.out.println(isIdValid + ".");
    }
}
