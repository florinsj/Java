package M3_violatingEqualsSimetry;

//Symmetry violations happen most often,when we extends a class that has overrided equals()

public class WrongVoucher extends Money {

    private String store;

    public WrongVoucher(int amount, String currency, String store) {
        super(amount, currency);
        this.store = store;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof WrongVoucher)) return false;
        WrongVoucher other = (WrongVoucher) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        boolean storeEquals = (this.store == null && other.store == null)
                || (this.store != null && this.store.equals(other.store));
        return this.amount == other.amount && currencyCodeEquals && storeEquals;

    }
    //other methods
}
