public class Main {
    public static void main(String[] args) {
        double itemPrice = 121.59;
        double shippingCost = itemPrice * .02;
        double totalWShipping = itemPrice + shippingCost;
        double totalWOShipping = itemPrice;

        if (itemPrice >= 100) {
            System.out.println("Your item cost $" + itemPrice + " so shipping is free, which makes your total $" + totalWOShipping);
        } else {
            System.out.println("Your item cost $" + itemPrice + " which means shipping will cost $" + shippingCost + ", making your total $" + totalWShipping);
        }
    }
}