package davidegiliberti.epicode_5_9_24.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "bevande")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Bevanda {
    @Setter(AccessLevel.NONE)
    @Id
    private long id;
    private String volume;
    private int calorie;
    private double prezzo;

    public Bevanda(String volume, int calorie, double prezzo) {
        this.volume = volume;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }


}
