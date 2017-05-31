/**
 * Created by judit on 31.05.17.
 */
public class ReguralMilk extends DairyProduct {

    public ReguralMilk(String name, int quantity, int... expirationDate) {
        super(name, quantity, expirationDate);
    }

    @Override
    public boolean warn() {
        return false;
    }
}
