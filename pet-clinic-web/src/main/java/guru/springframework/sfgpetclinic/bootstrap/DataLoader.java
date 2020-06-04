package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Starting bootstrap data");

        Owner owner1 = new Owner();
        owner1.setFirstName("Victor");
        owner1.setLastName("Hugo");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Laura");
        owner2.setLastName("Beatriz");

        ownerService.save(owner1);

        log.info("Created owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Vetson");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vet");
        vet2.setLastName("Sam");

        vetService.save(vet2);

        log.info("Created vets");
    }
}
