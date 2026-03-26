package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
        // Массив продуктов в корзине
        private final Food[] items;
        public ShoppingCart(Food[] items) {
            this.items = items; // Инициализируем корзину переданными продуктами
        }

        //Считаем общую сумму товаров в корзине без скидки
        public double getTotalSumWithoutDiscount() {
            double sum = 0;
            for (Food item : items) { // бежим по товарам
                sum += item.getAmount() * item.getPrice();
            }
            return sum;
        }

         //Считаем общую сумму товаров в корзине с учётом скидок.
        public double getTotalSumWithDiscount() {
            double sum = 0;
            for (Food item : items) {
                double discount = 0;
                if (item instanceof Discountable) {
                    discount = ((Discountable) item).getDiscount(); // Получаем скидку, если она есть
                }
                sum += item.getAmount() * item.getPrice() * (1 - discount); // Применяем скидку к цене
            }
            return sum;
        }

         //Считаем сумму всех вегетарианских продуктов без скидки.

        public double getTotalVegetarianSumWithoutDiscount() {
            double sum = 0;
            for (Food item : items) {
                if (item.isVegetarian()) { // Проверяем, вегетарианский ли продукт
                    sum += item.getAmount() * item.getPrice(); // Суммируем только вегетарианские продукты
                }
            }
            return sum;
        }
}
