package M4_fixingEqualsSymmetry;

public class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override   //informs the compiler that the next method will be overrided
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Money))
            return false;
        Money other = (Money) obj;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return (this.amount == other.amount) && currencyCodeEquals;
    }
}
