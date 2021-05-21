package com.company;
import java.util.Scanner;

public class GraphicsCard extends Identification {
    private String standard;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        if(!this.standard.isEmpty()) {
            this.standard = standard;
        }
    }

    public GraphicsCard() {
    }

    public GraphicsCard(String brand, String model, float price, String standard) {
        super(brand, model, price);
        this.standard = standard;
    }

    public void dataInput() {
        Scanner input = new Scanner(System.in);
        super.dataInput();
        System.out.println("\nGPU Standard: ");
        setStandard(input.nextLine());
    }

    public void printData() {
        System.out.println("\n--- GPU INFO ---\n\n");
        super.printData();
        System.out.println("Standard: " + getStandard() + ".");
    }
}
