import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, "red");
        Food greenApple = new Apple(8, 60, "green");

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalSumWithoutDiscount() + " руб.");
        System.out.println("Общая сумма со скидкой: " + cart.getTotalSumWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getTotalVegetarianSumWithoutDiscount() + " руб.");
    }
}
