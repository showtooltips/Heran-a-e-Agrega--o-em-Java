package com.company;
import java.util.Scanner;

public class Identification {
    private String brand;
    private String model;
    private float price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!this.brand.isEmpty()) {
            return;
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!this.brand.isEmpty()) {
            this.model = model;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(this.price >= 0) {
            this.price = price;
        }
    }

    public Identification() {
    }

    public Identification(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void dataInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nInsert the brand of the product: ");
        setBrand(input.nextLine());
        System.out.println("\nInsert the model of the product: ");
        setModel(input.nextLine());
        System.out.println("\nInsert the price of the product: ");
        setPrice(Float.parseFloat(input.nextLine()));
    }

    public void printData() {
        System.out.println("Brand: " + getBrand() + ".\n");
        System.out.println("Model: " + getModel() + ".\n");
        System.out.println("Price: " + getPrice() + ".\n");
    }
}
