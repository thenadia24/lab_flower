package ua.edu.ucu.apps.demo.flower;

public class RibbonDecorator extends Item{
    private final Item item;

    public RibbonDecorator(Item item){
        this.item = item;
    }
    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}