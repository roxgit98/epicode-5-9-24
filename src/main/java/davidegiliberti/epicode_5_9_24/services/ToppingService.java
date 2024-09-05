package davidegiliberti.epicode_5_9_24.services;

import davidegiliberti.epicode_5_9_24.entities.Topping;
import davidegiliberti.epicode_5_9_24.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingService {
    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> getAllToppings(){
        return toppingRepository.findAll();
    }

    public Topping saveTopping (Topping topping){
        return toppingRepository.save(topping);
    }
}
