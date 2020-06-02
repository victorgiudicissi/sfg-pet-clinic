package guru.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Pet {
    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
