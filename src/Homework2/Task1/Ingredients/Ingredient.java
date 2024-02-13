package Homework2.Task1.Ingredients;

public enum Ingredient {
    COFFEE(228.0),
    WATER(1.0),
    MILK(12.0),
    SUGAR(1.0),
    TEABAG(2.5),
    FILTER(8.0);


    private final double price;
    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}
