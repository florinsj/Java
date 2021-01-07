package J2;

public class Main41 {
    public static void main(String[] args) {
        //zero parameters examples
        MyFunction myFunction = ()->{
            System.out.println("Hello world"); };
        myFunction.apply();
    }
}
