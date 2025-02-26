package Pedidos;
public class Order {
    private String orderId;
    private Customer customer;
    private double amount;

    public Order(String orderId, Customer customer, double amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + orderId);
        customer.printCustomerDetails();
        System.out.println("Amount: $" + amount);
    }

    public void applyDiscount(double discountPercentage) {
        if (isValidDiscount(discountPercentage)) {
            amount -= calculateDiscount(discountPercentage);
        }
    }

    private boolean isValidDiscount(double discountPercentage) {
        return discountPercentage > 0 && discountPercentage <= 100;
    }

    private double calculateDiscount(double discountPercentage) {
        return amount * discountPercentage / 100;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }
}
