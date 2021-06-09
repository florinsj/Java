package M2_overridingEquals;

public class overrideEqualsExample {
    public static void main(String[] args) {
        Money income = new Money(100, "EUR");
        Money expenses = new Money(100, "EUR");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);

//        true --> because equals() was overrided
//        it checks if (it is the same object) or if  (same type with same values)
    }
}
