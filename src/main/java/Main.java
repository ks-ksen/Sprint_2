import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 95.42);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма без скидки: %.2f руб.%n",  cart.getTotalSumWithoutDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f руб.%n",  cart.getTotalSumWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов (без скидки): %.2f руб.%n",  cart.getTotalVegetarianSumWithoutDiscount());
    }
}
