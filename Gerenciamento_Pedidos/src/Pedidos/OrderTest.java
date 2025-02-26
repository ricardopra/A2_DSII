package Pedidos;
public class OrderTest {
    public static void main(String[] args) {
        Customer customer = new Customer("C123", "Ricardo", "ricardo@ricardo.com.br", "123-456-7890");
        Order order = new Order("O456", customer, 200.0);

        System.out.println("Antes do desconto:");
        order.printOrderDetails();

        order.applyDiscount(10);

        System.out.println("\nApós 10% de desconto:");
        order.printOrderDetails();
    }
}
