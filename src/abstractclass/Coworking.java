package abstractclass;

public abstract class Coworking {
    public double calculateTotalPrice(int startHour, int endHour) {
        double totalPrice = 0;
        int totalHours = startHour < endHour ? endHour - startHour : 24 - startHour + endHour;
        for (int hour = startHour; hour % 24 != endHour; hour++) {
            totalPrice += calculateHourlyPrice(hour % 24);
        }
        return (1 - calculateDiscountForTotalHours(totalHours)) * totalPrice;
    }

    protected abstract double calculateHourlyPrice(int hour);

    protected abstract double calculateDiscountForTotalHours(int hours);
}

