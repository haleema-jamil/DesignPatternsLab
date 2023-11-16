package GangOfFour.Builder.Food;

public abstract class TeaDecorator implements Decorator {

    protected Decorator decoratedTea;

    private double price;

    public TeaDecorator(Decorator decoratedTea) {
        this.decoratedTea = decoratedTea;
    }
    
    @Override
    public void Sweetness() {
        decoratedTea.Sweetness();
    }

    @Override
    public void cream() {
        decoratedTea.cream();
    }

    @Override
    public void Sugar() {
        decoratedTea.Sugar();
    }
    
}