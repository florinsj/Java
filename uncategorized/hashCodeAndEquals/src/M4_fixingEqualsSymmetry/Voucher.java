package M4_fixingEqualsSymmetry;

public class Voucher {

    //we use composition instead inheritance
    //we gone hava a Money object instead extending Moeney class

    private Money value;
    private String store;

    public Voucher(int amount, String currencycode, String store) {
        this.value = new Money(amount, currencycode);
        this.store = store;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Voucher)) return false;
        Voucher other = (Voucher) o;
        boolean valueEquals = (this.value == null && other.value == null)
                || (this.value != null && this.value.equals(other.value));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return valueEquals && storeEquals;
    }
    //other methods
}
