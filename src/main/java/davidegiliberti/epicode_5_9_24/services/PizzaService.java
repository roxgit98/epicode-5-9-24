package davidegiliberti.epicode_5_9_24.services;

import davidegiliberti.epicode_5_9_24.entities.Pizza;
import davidegiliberti.epicode_5_9_24.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizze(){
        return pizzaRepository.findAll();
    }

    public Pizza savePizza(Pizza pizza){
        return pizzaRepository.save(pizza);
    }
}
