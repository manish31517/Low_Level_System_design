package DecoratorDesingPattern;

import DecoratorDesingPattern.Decorator.CheeseTopping;
import DecoratorDesingPattern.Decorator.MashroomTopping;
import DecoratorDesingPattern.Pizza.BasePizza;
import DecoratorDesingPattern.Pizza.Farmhouse;

public class PizzaMania {
    public static void main(String [] args){
        BasePizza bp = new Farmhouse();
        BasePizza bp1 = new CheeseTopping(new Farmhouse());
        System.out.println("Farmhouse Pizza"+bp.cost());
        System.out.println("Farmhouse Pizza with cheese"+bp1.cost());
        bp1= new MashroomTopping(new CheeseTopping(new Farmhouse()));
        System.out.println("Farmhouse pizza with mashroom and cheese "+ bp1.cost());
    }
}
