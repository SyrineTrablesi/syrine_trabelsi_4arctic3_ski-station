package tn.esprit.syrinetrabelsi4arctic3.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Skier implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int numSkier;
    String firstName;
    String LastName;
    LocalDate dateOfBirth;
    String city;

    @OneToMany(mappedBy = "Sk")
    List<Registration> registrations;

    @OneToOne(cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
    Subscription subscription;

    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;


}