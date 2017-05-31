/**
 * Created by judit on 31.05.17.
 */
public class Store {

    private static Store singleStore = null;

    private Store() {
    }

    public static Store getInstance() {
        if (singleStore == null) {
            return singleStore = new Store();
        } else {
            return singleStore;
        }
    }
}
