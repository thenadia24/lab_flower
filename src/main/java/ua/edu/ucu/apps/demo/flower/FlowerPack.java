package ua.edu.ucu.apps.demo.flower;

public class FlowerPack {
    private Flower flower;
    private int quantity;

    FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }
    public double getPrice() {
        return  flower.getPrice() * quantity;
    }
}