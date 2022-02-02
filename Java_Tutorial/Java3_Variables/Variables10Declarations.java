package Java_Tutorial.Java3_Variables;

public class Variables10Declarations {
    public static void main(String[] args) {
        int v;              // variable declaration
        int x = 1;          // variable declaration and initialization
        int y = 1, z = 2;    // variable declaration and initialization
        int a, b, c = (a = 1 + (b = 2)) + 1;    // variable declaration and initialization
        System.out.println("a= " + a + " b= " + b + " c= " + c);
    }
}
