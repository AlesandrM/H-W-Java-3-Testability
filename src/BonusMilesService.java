public class BonusMilesService {
    public int calculate(int price, int bonus) {

        int mili = price / bonus;
        System.out.println(mili);

        return mili;
    }
}
