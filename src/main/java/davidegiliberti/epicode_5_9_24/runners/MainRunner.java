package davidegiliberti.epicode_5_9_24.runners;

import davidegiliberti.epicode_5_9_24.entities.Bevanda;
import davidegiliberti.epicode_5_9_24.entities.Pizza;
import davidegiliberti.epicode_5_9_24.entities.Topping;
import davidegiliberti.epicode_5_9_24.services.BevandaService;
import davidegiliberti.epicode_5_9_24.services.PizzaService;
import davidegiliberti.epicode_5_9_24.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainRunner implements CommandLineRunner {

    @Autowired
    private ToppingService toppingService;
    @Autowired
    private BevandaService bevandaService;
    @Autowired
    private PizzaService pizzaService;

    @Override
    public void run (String... args){

        Bevanda bevanda = new Bevanda(1,"water", "0,5L", 0, 1.50);
        bevandaService.saveBevanda(bevanda);

        Topping topping = new Topping(1 ,"cheese", 50, 0.50);
        toppingService.saveTopping(topping);

        Pizza pizza = new Pizza(1,"margherita", List.of("mozzarella", "pomodoro"), List.of(topping), 900, 8.50);
        pizzaService.savePizza(pizza);
    }
}
