package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "apples";
        double price = 7.10;
        int itemQuantity = 7;

        double totalPrice = price * itemQuantity;

        System.out.println("You bought " + itemQuantity + " " + itemName + " for $" + totalPrice);
    }
}
