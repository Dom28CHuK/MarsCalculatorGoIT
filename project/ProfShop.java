package project;

public class ProfShop {
    public boolean isPriceOk(int price) {
        return price < 1000;
    }

    public float calculateRegularDiscountPrice(float price) {
        return price - 10%;
    }

    public boolean isDiscount50(int price) {
        return price > 1000;
    }

    public boolean isPriceHappy(int price, int year, int day) {
        return price == year * day;
    }

    public static void main(String[] args) {
        ProfShop profShop = new ProfShop();

        System.out.println(profShop.isPriceOk(1500));
        System.out.println(profShop.calculateRegularDiscountPrice(1500));
        System.out.println(profShop.isDiscount50(256));
        System.out.println(profShop.isPriceHappy(23700, 3950, 6));
    }
}
