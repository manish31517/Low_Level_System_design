package FactoryDesingPattern;

public class ShapeDraw {
    public static void main(String[] args) {
        ShapFactory shapFactory = new ShapFactory();
        Shape circle = shapFactory.getShape("Circle");
         System.out.println(circle.draw());
    }
}
