public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;//за каждые 20 руб. бонус 1 миля
        return miles;
    }
}
