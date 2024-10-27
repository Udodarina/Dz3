public class BonusMilesService {
    public int calculate(int bonus) {
        if (bonus > 0) {
            bonus = bonus / 20;
        } else {
            bonus = 0;
        }
        return bonus;
    }
}
