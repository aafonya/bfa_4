public class Main {

    public static void main(String[] args) {
        LongLastingMilk newLLM = new LongLastingMilk("longMilky", 2, 2017, 6, 12);
        ReguralMilk newRM = new ReguralMilk("regularMilk", 3, 6, 10);
        Store storeBp = Store.getInstance();
    }
}
