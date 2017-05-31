/**
 * Created by judit on 31.05.17.
 */
public class LongLastingMilk extends DairyProduct {

    public LongLastingMilk(String name, int quantity, int... expirationDate) {
        super(name, quantity, expirationDate);
    }

    @Override
    public boolean warn() {
        return false;
    }
}
