public class App {
    public static void main(String[] args) {
        displayCard("Kyoko Kirigiri", 20000, "Gold");
        System.out.println("****************");
        displayCard("Makoto Naegi", 10000, "Silver");
        System.out.println("****************");
        displayCard("Monokuma", 50000, "Extreme");
        System.out.println("****************");
        displayCard("Junko Enoshima", 40000, "Platinum");
    }

    public static void displayCard(String name, double purchaseAmount, String type) {
        double discount = calculateDiscount(type, purchaseAmount);
        System.out.println("Customer Name: " + name);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount: " + (purchaseAmount - discount));
    }

    public static double calculateDiscount(String type, double purchaseAmount) {
        switch (type) {
            case "Gold":
                return purchaseAmount * 0.10;
            case "Silver":
                return purchaseAmount * 0.05;
            case "Platinum":
                return purchaseAmount * 0.20;
            case "Extreme":
                return purchaseAmount * 0.30;
            default:
                return 0;
        }
    }
}
