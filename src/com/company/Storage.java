package com.company;
import java.util.Scanner;

public class Storage extends Identification {
    private String type;
    private int capacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!this.type.isEmpty()) {
            this.type = type;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(this.capacity >= 0) {
            this.capacity = capacity;
        }
    }

    public Storage() {
    }

    public Storage(String brand, String model, float price, String type, int capacity) {
        super(brand, model, price);
        setType(type);
        setCapacity(capacity);
    }

    public void dataInput() {
        Scanner input = new Scanner(System.in);
        super.dataInput();
        System.out.println("\nInput the the type of the product: ");
        setType(input.nextLine());
        System.out.println("\nInput the capacity of the product: ");
        setCapacity(Integer.parseInt(input.nextLine()));
    }

    public void printData() {
        super.printData();
        System.out.println("Type: " + getType() + ".\n");
        System.out.println("Capacity: " + getCapacity() + ".\n");
    }
}
