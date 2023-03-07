package DecoratorDesingPattern.Decorator;

import DecoratorDesingPattern.Pizza.BasePizza;

public class CheeseTopping extends ToppingDecorator{
    private BasePizza basePizza;
    public CheeseTopping(BasePizza basePizza){
        this.basePizza= basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
