package com.company;

public class RAM extends Storage {
    public RAM() {
    };
    public RAM(String brand, String model, float price, String type, int capacity) {
        super(brand, model, price, type, capacity);
    }

    public void printData() {
        System.out.println("\n--- RAM INFO ---\n\n");
        super.printData();
    }
}
