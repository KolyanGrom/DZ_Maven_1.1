public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actual = (int) service.calculate(100_000_000, false);
        System.out.println(actual);
    }

}
