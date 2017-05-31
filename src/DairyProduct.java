/**
 * Created by judit on 31.05.17.
 */
public abstract class DairyProduct extends Products {
    private int[] expirationDate;

    public DairyProduct(String name, int quantity, int... expirationDate) {
        super(name, quantity);
        this.expirationDate = expirationDate;
    }

    public abstract boolean warn();
}
