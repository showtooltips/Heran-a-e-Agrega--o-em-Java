package com.company;

public class Notebook {
    private float screenSize;
    public MotherBoard mb = new MotherBoard();
    public HD disk = new HD();
    public RAM slot01 = new RAM();
    public RAM slot02 = new RAM();
    public RAM slot03 = new RAM();
    public RAM slot04 = new RAM();

    public float getScreenSize() {
            return screenSize;
    }

    public void setScreenSize(float screenSize) {
        if(screenSize > 0) {
            this.screenSize = screenSize;
        }
    }

    public Notebook() {};

    public Notebook(float screenSize) {
        this.screenSize = screenSize;
    }
}
