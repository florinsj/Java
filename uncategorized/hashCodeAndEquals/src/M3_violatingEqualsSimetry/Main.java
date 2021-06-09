package M3_violatingEqualsSimetry;

public class Main {
    public static void main(String[] args) {
        Money cash1 = new Money(50, "USD");
        Money cash2 = new Money(50, "USD");

        WrongVoucher voucher1 = new WrongVoucher(50, "USD", "Amazon");
        WrongVoucher voucher2 = new WrongVoucher(50, "USD", "Amazon");

        System.out.println(cash1.equals(cash2)); //true
        System.out.println(cash2.equals(cash1)); //true

        System.out.println(voucher1.equals(voucher2)); //true
        System.out.println(voucher2.equals(voucher1)); //true

        System.out.println(voucher1.equals(cash1));
        //false

        System.out.println(cash1.equals(voucher1));
        //true  ---> wrong --> violates the symmetry criteria of the equals() contract
        //Symmetry violations happen most often,when we extends a class that has overrided equals()
    }

}
