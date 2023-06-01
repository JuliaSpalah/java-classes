package abstractclass;

public class UndergroundCoworking extends Coworking {
    @Override
    protected double calculateHourlyPrice(int hour) {
        if (hour >= 0 && hour <= 7) {
            return 3.50;
        }
        return 4;
    }

    @Override
    protected double calculateDiscountForTotalHours(int hours) {
        if (hours < 3) {
            return 0;
        } else if (hours < 7) {
            return 0.05;
        }
        return 0.1;
    }
}
