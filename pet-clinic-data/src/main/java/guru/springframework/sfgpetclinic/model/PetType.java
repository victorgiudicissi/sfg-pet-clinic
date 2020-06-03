package guru.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PetType extends BaseEntity {
    private String description;
}
