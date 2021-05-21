package com.company;

public class Desktop {

    private String coolerType;
    public MotherBoard mb = new MotherBoard();
    public GraphicsCard gpu = new GraphicsCard();
    public HD disk = new HD();
    public RAM slot01 = new RAM();
    public RAM slot02 = new RAM();
    public RAM slot03 = new RAM();
    public RAM slot04 = new RAM();

    public String getCoolerType() {
        return coolerType;
    }

    public void setCoolerType(String coolerType) {
        if(!this.coolerType.isEmpty()) {
            this.coolerType = coolerType;
        }
    }

    public Desktop() {};

    public Desktop(String coolerType) {
        this.coolerType = coolerType;
    }
}
