import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] basket = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(basket);

        System.out.println("Сумма без скидки: " + cart.getTotalPrice());
        System.out.println("Сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских: " + cart.getTotalVegetarianPrice());
    }
}
// Ветка task-1 готова к проверке