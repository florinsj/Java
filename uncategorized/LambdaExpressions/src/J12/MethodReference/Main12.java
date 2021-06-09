package J12.MethodReference;

//method reference
public class Main12 {

    public static void main(String[] args) {

        //lambda expression
        MyPrinter myPrinter = (s) -> System.out.println(s);

        //lambda method reference
        MyPrinter myPrinter1 = System.out::println;

        // :: - double colons signal to Java Compiler that this is a method reference
        //the method reference is what cames after  ::
        // class or object whow owns the method comes before ::

        myPrinter1.print("Hello World!");

    }
}
