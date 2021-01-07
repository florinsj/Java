package J10;

//capture local and static variables in lambda expression
public class Main10 {

    //static variable
    //we can change the value of static variable after it was referenced in lambda expression
    static String staticVariable = "Hey, i am static !";

    //capture local variable in lambda expression
    public static void main(String[] args) {

        //local variable
        //we cannot change the value of local variable after it was referenced in lambda expression
        String localVariable = "Hello LocalVariable ";


        MyInterface myInterface = (text) -> {
            System.out.println(text + localVariable + staticVariable);
        };

        //localVariable="blabla";  --lambda expression will throw error, it needs final variables

        staticVariable = "blabla";  //ok

        myInterface.printf(" ABC ");

    }
}
