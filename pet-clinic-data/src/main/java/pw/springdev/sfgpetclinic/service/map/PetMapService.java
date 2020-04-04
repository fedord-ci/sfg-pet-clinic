package pw.springdev.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;
import pw.springdev.sfgpetclinic.model.Pet;
import pw.springdev.sfgpetclinic.service.PetService;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-15
 */
@Service
public class PetMapService extends AbstractMapService<Pet, Long>
    implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
