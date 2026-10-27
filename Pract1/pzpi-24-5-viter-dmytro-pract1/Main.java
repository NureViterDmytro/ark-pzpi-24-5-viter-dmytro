package org.example;

public class Main {
    static void main() {
        boolean condition = true;
        if (condition) {
            System.out.println("Valid");
        }
        int basePrice = 0;
        int taxAmount = 0;

        // Погано (незрозумілі назви змінних)
        int a = basePrice + taxAmount;

        // Добре (самоописова назва)
        int totalSum = basePrice + taxAmount;
    }

    /**
     * Обчислює загальну вартість замовлення з урахуванням знижки.
     * @param price базова ціна товару
     * @param discount відсоток знижки
     * @return кінцева вартість
     */
    public double calculatePrice(double price, double discount) {
        return price * (1 - discount);
    }
}