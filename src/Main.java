public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int mili = service.calculate(10000, 20);

        System.out.println(mili);


    }
}
