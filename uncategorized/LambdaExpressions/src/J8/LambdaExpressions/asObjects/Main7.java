package J8.LambdaExpressions.asObjects;

// lambdas as Objects
public class Main7 {
    public static void main(String[] args) {


        MyComparator myComparator = (a, b) -> a > b;
        boolean result=myComparator.compare(5,2);
        System.out.println(result);
    }
}

