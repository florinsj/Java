package J5.LambdaExpressions.MultipleImplMethods;

public interface MyInterface {


    //because interface has only one method without implementation
    // this method is suitable for lambda expression
    void printIt(String text);

    default public void printSomething(String text) {
        System.out.println("the argument is "+text);
    }

    static void printItToSystem (String text) {
        System.out.println(text);
    }
}
