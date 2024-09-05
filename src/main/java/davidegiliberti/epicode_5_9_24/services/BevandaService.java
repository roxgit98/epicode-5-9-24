package davidegiliberti.epicode_5_9_24.services;

import davidegiliberti.epicode_5_9_24.entities.Bevanda;
import davidegiliberti.epicode_5_9_24.repositories.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BevandaService {
    @Autowired
    private BevandaRepository bevandaRepository;

    public List<Bevanda> getAllBevande(){
        return bevandaRepository.findAll();
    }

    public Bevanda saveBevanda(Bevanda bevanda){
        return bevandaRepository.save(bevanda);
    }
}
