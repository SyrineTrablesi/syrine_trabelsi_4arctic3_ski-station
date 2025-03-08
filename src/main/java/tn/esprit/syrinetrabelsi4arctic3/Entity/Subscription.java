package tn.esprit.syrinetrabelsi4arctic3.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.time.LocalDate;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSub;
    LocalDate startDate;
    LocalDate endDate;
    Float price;
    @Enumerated(EnumType.STRING)
    TypeSubscription typeSub;

    @OneToOne   //parent
    Skier skier;

}
