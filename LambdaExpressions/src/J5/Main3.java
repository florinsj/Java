package J5;

//example of lambda expression for an interface with many implemented methods but
//only one unimplemented method

public class Main3 {
    public static void main(String[] args) {
        MyInterface myInterface=(String text)-> {
            System.out.println(text);
        };
        myInterface.printIt("Lambdaaaa!");
    }
}
