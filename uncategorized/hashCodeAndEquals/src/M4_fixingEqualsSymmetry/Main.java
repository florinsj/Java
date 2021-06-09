package M4_fixingEqualsSymmetry;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(100, "USD");
        Money money2 = new Money(100, "USD");

        Voucher voucher1 = new Voucher(100, "USD", "LIDL");
        Voucher voucher2 = new Voucher(100, "USD", "LIDL");

        System.out.println(money1.equals(money2));
        //true
        System.out.println(money2.equals(money1));
        //true
        //-->symmetrya

        System.out.println(voucher1.equals(voucher2));
        //true
        System.out.println(voucher2.equals(voucher1));
        //true
        //-->symmetry

        System.out.println(money1.equals(voucher1));
        //falsea
        System.out.println(voucher1.equals(money1));
        //false
        //-->symmetry

    }
}
