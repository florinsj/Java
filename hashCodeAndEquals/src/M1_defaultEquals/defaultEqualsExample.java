package M1_defaultEquals;

public class defaultEqualsExample {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);

//        false --> because the default implementation of equals()
//        say that equality is the same as object identity
//        here we have 2 distict obects : income and expenses
    }
}
