package ua.edu.ucu.apps.demo.flower;

public class PaperDecorator extends Item{
    private final Item item;

    public PaperDecorator(Item item){
        this.item = item;
    }
    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}