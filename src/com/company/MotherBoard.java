package com.company;
import java.util.Scanner;

public class MotherBoard extends Identification {
    private String cpuType;

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        if(!this.cpuType.isEmpty()) {
            this.cpuType = cpuType;
        }
    }

    public MotherBoard() {
    }

    public MotherBoard(String brand, String model, float price, String cpuType) {
        super(brand, model, price);
        this.cpuType = cpuType;
    }

    public void dataInput() {
        Scanner input = new Scanner(System.in);
        super.dataInput();
        System.out.println("CPU Type of the product: \n");
        setCpuType(input.nextLine());
    }

    public void printData() {
        System.out.println("\n--- MOTHERBOARD INFO ---\n\n");
        super.printData();
        System.out.println("CPU Type: " + getCpuType() + ".\n");
    }
}
