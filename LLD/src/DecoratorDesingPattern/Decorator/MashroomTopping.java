package DecoratorDesingPattern.Decorator;

import DecoratorDesingPattern.Pizza.BasePizza;

public class MashroomTopping extends ToppingDecorator {
    private BasePizza basePizza;
    public MashroomTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
