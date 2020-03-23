package pw.springdev.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pw.springdev.sfgpetclinic.model.Owner;
import pw.springdev.sfgpetclinic.model.Pet;
import pw.springdev.sfgpetclinic.model.PetType;
import pw.springdev.sfgpetclinic.model.Vet;
import pw.springdev.sfgpetclinic.service.OwnerService;
import pw.springdev.sfgpetclinic.service.VetService;
import pw.springdev.sfgpetclinic.service.map.OwnerServiceMap;
import pw.springdev.sfgpetclinic.service.map.VetServiceMap;

/**
 * Created by FedorD on 2020-03-23
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Jessie");
        vet1.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
