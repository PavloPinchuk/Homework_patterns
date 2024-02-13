package Homework2.Task1.Drinks;

import Homework2.Task1.Ingredients.Ingredient;

public class FilterCoffee extends Drink{
    public FilterCoffee(double sugar) {
        this.ingredients.put(Ingredient.FILTER,1.0);
        this.ingredients.put(Ingredient.WATER,0.2);
        this.ingredients.put(Ingredient.SUGAR,sugar);
        this.sellingPrice = 25;
    }
}
