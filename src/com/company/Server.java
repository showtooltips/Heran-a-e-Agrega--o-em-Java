package com.company;

public class Server {

    private float networkSpeed;
    public MotherBoard mb = new MotherBoard();
    public GraphicsCard gpu01 = new GraphicsCard();
    public GraphicsCard gpu02 = new GraphicsCard();
    public HD disk01 = new HD();
    public HD disk02 = new HD();
    public RAM slot01 = new RAM();
    public RAM slot02 = new RAM();
    public RAM slot03 = new RAM();
    public RAM slot04 = new RAM();

    public float getNetworkSpeed() {
        return networkSpeed;
    }

    public void setNetworkSpeed(float networkSpeed) {
        if(networkSpeed >= 0) {
            this.networkSpeed = networkSpeed;
        }
    }

    public Server() {};

    public Server(float networkSpeed) {
        this.networkSpeed = networkSpeed;
    }
}
