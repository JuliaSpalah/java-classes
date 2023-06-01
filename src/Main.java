import abstractclass.Coworking;
import abstractclass.UndergroundCoworking;

public class Main {
    public static void main(String[] args) {
        Coworking coworking = new UndergroundCoworking();
        System.out.println(coworking.calculateTotalPrice(13, 23));
        System.out.println(coworking.calculateTotalPrice(23, 8));
        System.out.println(coworking.calculateTotalPrice(23, 1));
    }
}