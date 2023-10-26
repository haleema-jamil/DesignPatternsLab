package GangOfFour.Builder.Food;

public class DecoratedTea extends TeaDecorator{
    
    public DecoratedTea(Decorator decoratedTea) {
        super(decoratedTea);
    }
    
    @Override
    public void Sweetness() {
        decoratedTea.Sweetness();
        SweetnessType(decoratedTea);
    }

    @Override
    public void cream() {
        decoratedTea.cream();
        Cream(decoratedTea);

    }

    @Override
    public void Sugar() {
        decoratedTea.Sugar();
        SugarQty(decoratedTea);
    }

    private void SweetnessType(Decorator decoratedTea) {
        System.out.println("Sweetness Type: Brown Sugar");
    }

    private void Cream(Decorator decoratedTea) {
        System.out.println("Cream Added");
    }

    private void SugarQty(Decorator decoratedTea) {
        System.out.println("2 Spoons Added");
    }
}
