package davidegiliberti.epicode_5_9_24.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "pizza")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pizza {
    @Setter(AccessLevel.NONE)
    @Id
    private long id;
    private String nome;
    private List<String> ingredientiBase;
    private List<Topping> toppings;
    private int calorie;
    private double prezzo;

    public Pizza(String nome, List<String> ingredientiBase, List<Topping> toppings, int calorie, double prezzo) {
        this.nome = nome;
        this.ingredientiBase = ingredientiBase;
        this.toppings = toppings;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}
