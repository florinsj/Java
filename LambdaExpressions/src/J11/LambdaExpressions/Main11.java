package J11.LambdaExpressions;

//capture instance variable in lambda expression
public class Main11 {
    //instance variable
    //we can change the value of instance variable after reference in lambda expression
    private String instanceVariable = "Hey, i am instanceVariable !";

    public void doIt() {
        MyInterface myInterface = (text) -> {
            System.out.println(text + instanceVariable);
        };
        myInterface.printf(" ABC ");
        instanceVariable = "instanceVar changed! ";
        myInterface.printf(" ABC ");
    }

    public static void main(String[] args) {
        Main11 instance = new Main11();
        instance.doIt();
    }
}
