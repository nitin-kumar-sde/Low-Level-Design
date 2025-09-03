package design_patterns.structural.decorator;

public class CakeShop {
    public static void main(String[] args) {
        Cake myCake = new BaseCake();
        System.out.println(myCake.getDescription() + " => ₹" + myCake.getCost());

        // Add chocolate layer
        myCake = new ChocolateDecorator(myCake);
        System.out.println(myCake.getDescription() + " => ₹" + myCake.getCost());

        // Add fruits
        myCake = new FruitsDecorator(myCake);
        System.out.println(myCake.getDescription() + " => ₹" + myCake.getCost());

        // Add sprinkles
        myCake = new SprinkleDecorator(myCake);
        System.out.println(myCake.getDescription() + " => ₹" + myCake.getCost());
    }
}
