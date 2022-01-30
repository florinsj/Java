// Florin Stanciu
// Learning Java
// Variables

//Variable
//            - is a containter wich holds a value
//            - is a name of a memory location (reserved area allocated in memory)
//            - three types of variables :
//                                          - local variables
//                                          - instance variables
//                                          - static variables

// local variable - variable declared inside the body of a method.can be used only within
//                  that method.Outside methods aren't even aware that the variable exists.
//                - !!! local variable CANNOT be declared with "static" keyword

//Instance variable
//                   - a variable declared inside a class, but outside the body of a method
//                   - it is a instance variable because its value is instance specific
//                      and is not shared among instances
//                   - !! it is NOT declared with "static" keyword

// Static variable
//                 - a variable declared as static , using "static" keyword
//                 - cannot be local
//                 - it is a single copy shared among all the instances of the class
//                 - static variable = class variable
//                 - memory allocation for static variable - only once when class is loaded in memory


// Variable have types    ex. int,double,String

// sintax  without initialization: --> dataType variableName;          ex. int data;
// sintax  with initialization   : --> dataType variableName=value;    ex. int data=50;

// ex. --> adding lower type
package Java_Tutorial;

public class T3_Variables7AddingLowerType {
    public static void main(String[] args) {
        byte a=10;
        byte b=10;
        // byte c=a+b; // compile error because a and b will pe treated as integers
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
