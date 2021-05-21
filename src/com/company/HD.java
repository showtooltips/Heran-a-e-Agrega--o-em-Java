package com.company;

public class HD extends Storage {
    public HD() {
    }

    public HD(String brand, String model, float price, String type, int capacity) {
        super(brand, model, price, type, capacity);
    }

    public void printData() {
        System.out.println("\n--- HD INFO ---\n\n");
        super.printData();
    }
}
