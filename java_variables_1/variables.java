package Learning_Java.java_variables_1;


// Variables in Java
// A variable is a container that holds data that can be changed during the execution of a program

//Types of Variables
        //1. Local Variables
        //2. Instance Variables
        //3. Static Variables
        
/* Local Variables  
- This is declared inside a method.
- Can be accessed only inside the method
- Cannot be accessed outside the method
- Scope is limited to the method
- Memory is allocated when the method is called
- Memory is deallocated when the method ends
- It is created when the method is called 
- Examples include;
- int x;
- double y;
- char z;
- String name;
- boolean flag;
- etc
*/

/* Instance Variables
- This is declared inside a class but outside any method
- Can be accessed by all methods in the class
- Scope is limited to the class
- Memory is allocated when an object of the class is created
- Memory is deallocated when the object is destroyed
- It is created when an object of the class is created
- Examples include;
- int age;
- String name;
- boolean flag;
- etc
*/

/* Static Variables
- This is declared inside a class but outside any method
- Can be accessed by all methods in the class
- Scope is limited to the class
- Memory is allocated when the class is loaded
- Memory is deallocated when the class is unloaded
- It is created when the class is loaded
- Examples include;
- int age;
- String name;
- boolean flag;
- etc
*/
// ========================Let see how it works in code========================   
public class variables {
    // Static variables- Can be declared inside a class but outside
    // any method and can be accessed by all methods in the class
    
    static String SchoolName = "Publica Academy"; // Static variable
    static String studentName; // Static variable
    static int studentID; // Static variable
    static boolean isStudent = true; // Static variable
    
    
    // Instance variables- Can be declared inside a class but outside
    // any method and can be accessed by all methods in the class
    int age =12; // Instance variable
    String name = "Christopher"; // Instance variable
    boolean flag=true; // Instance variable

    void display(){
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Flag: " + flag);
    }
    public static void main(String[] args){
        // Accessing static variables
     

        // Define students
        variables student1 = new variables();
        variables student2 = new variables();

        student1.studentName = "Chris";
        student1.studentID = 12345;

        student2.studentName = "John";
        student2.studentID = 54321;
    
        // Display student information
        System.out.println(variables.SchoolName);
        System.out.println("Student1 Name: " + student1.studentName);
        System.out.println("Student1 ID: " + student1.studentID);

        System.out.println("Student2 Name: " + student2.studentName);
        System.out.println("Student2 ID: " + student2.studentID);
        System.out.println("Is Student: " + isStudent);

        // Accessing instance variables

        variables obj = new variables();
        obj.display();

    //  Local variables- Can only be declared and accessed inside a method
        int id =12345; // Local variable
        String name = "Chris"; // Local variable
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println(name+id);
    }

}
