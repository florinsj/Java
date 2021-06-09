package J1.LambdaExpressions;

import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {

        //anonymous implementation
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        int comparison = stringComparator.compare("hello", "world");
        System.out.println(comparison);

        //implementation using lambda expression
        Comparator<String> stringComparatorLambda =
                (String s1, String s2) -> {
                    return s1.compareTo(s2);
                };
        int lambdaComparision = stringComparatorLambda.compare("hello", "world");
        System.out.println(lambdaComparision);

        //implementation using lambda expression  - simplified- no type specified
        Comparator<String> stringComparatorLambda2 =
                (s1, s2) -> {
                    return s1.compareTo(s2);
                };
        int lambdaComparision2 = stringComparatorLambda2.compare("hello", "world");
        System.out.println(lambdaComparision2);
    }


}
