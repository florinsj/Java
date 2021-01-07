package J9;

//local variable capture in lambda expressions
public class Main8 {
    public static void main(String[] args) {

        String myString = "Test"; //local variable

        MyFactory myFactory = (chars) -> {
            System.out.println(myString + ":" + new String(myString));
            return myString + ":" + new String(chars);
        };
        char[] myChar = {'a', 'b', 'c'};
        myFactory.create(myChar);

    }
}
