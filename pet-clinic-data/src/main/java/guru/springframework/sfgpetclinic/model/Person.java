package guru.springframework.sfgpetclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
