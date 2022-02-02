package Java_Tutorial.Java3_Variables;

public class Variables11localVariableScope {

    // the scope visibility of a local variable start from the declaration to the end of block

    static int x = 6;

    public static void main(String[] args) {
        System.out.println("x=" + x); // x=6  static variable x

        // declaration of local variable x
        // from here start the scope of local variable x
        int x = (x = 3) * 4;
        System.out.println("x=" + x);
    }

}
