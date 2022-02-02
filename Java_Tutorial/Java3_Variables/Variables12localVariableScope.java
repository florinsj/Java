package Java_Tutorial.Java3_Variables;

public class Variables12localVariableScope {
    public static void main(String[] args) {

        {
            int i = 1;
            System.out.println("i=" + i);
        }
        for (int i = 0; i < 10; i++)
            System.out.println("i=" + i);
    }
      /* compilation error if  i is NOT in an enclosing block that make the disjunction
         to the for block . i from enclosing block {}  have different domain than for block */
}
