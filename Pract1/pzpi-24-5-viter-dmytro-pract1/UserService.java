package org.example;

// Назва класу: CamelCase з великої літери
public class UserService {

    // Константа: UPPER_SNAKE_CASE
    private static final int MAX_RETRIES = 3;

    // Змінна (поле): camelCase з маленької літери
    private double basePrice = 100.0;

    // Метод: camelCase з маленької літери
    public double calculateTotal() {
        return basePrice * MAX_RETRIES;
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        System.out.println("Загальна сума: " + service.calculateTotal());
    }
}