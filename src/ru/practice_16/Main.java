package ru.practice_16;


import ru.practice_16.items.Dish;
import ru.practice_16.items.Drink;
import ru.practice_16.items.Item;
import ru.practice_16.models.InternetOrder;
import ru.practice_16.models.OrderManager;
import ru.practice_16.models.RestaurantOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Item drink1 = new Drink(5, "Sprite", "Сладкий газированный напиток");
        Item dish1 = new Dish(25,"Суп","Куриный бульон");
        Item drink2 = new Drink(10, "Cola", "Сладкий газированный напиток");
        Item drink3 = new Drink(15, "Mirinda", "Сладкий газированный напиток");

        OrderManager orderManager = new OrderManager();

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(drink2);
        internetOrder.add(drink3);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.add(drink1);
        restaurantOrder.add(dish1);

        RestaurantOrder restaurantOrder2 = new RestaurantOrder();
        restaurantOrder2.add(dish1);
        restaurantOrder2.add(dish1);
        restaurantOrder2.add(dish1);

        orderManager.add("Москва, ул. Полины-Осипенко д. 30", internetOrder);
        orderManager.add("Москва, пр. Вернадского, д. 76", internetOrder);
        orderManager.add(0, restaurantOrder2);
        orderManager.add(2, restaurantOrder);

        System.out.println("Количество в Ресторанных заказах - Sprite: " + orderManager.itemRestaurantQuantity("Sprite"));
        System.out.println("Количество в Ресторанных заказах - Суп: " + orderManager.itemRestaurantQuantity("Суп"));
        System.out.println("Количество в Интернет заказах - Суп: " + orderManager.itemInternetQuantity("Суп"));
        System.out.println("Сумма (инт) - " + orderManager.internetCostSummary() + "rub");
        System.out.println("Сумма (рест)- " + orderManager.restaurantCostSummary() + "rub");
        System.out.println("Следующий стол - №" + orderManager.freeTableNumber());
        System.out.println("Свободные столы - " + Arrays.toString(orderManager.freeTableNumbers()));
    }
}
