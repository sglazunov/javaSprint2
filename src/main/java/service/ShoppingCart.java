package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Food item : items) {
            total = total + (item.getAmount() * item.getPrice());
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemCost = item.getAmount() * item.getPrice();

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                double discount = discountableItem.getDiscount();
                itemCost = itemCost - (itemCost * discount / 100.0);
            }
            total = total + itemCost;
        }
        return total;
    }

    public double getTotalVegetarianPrice() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total = total + (item.getAmount() * item.getPrice());
            }
        }
        return total;
    }
}
