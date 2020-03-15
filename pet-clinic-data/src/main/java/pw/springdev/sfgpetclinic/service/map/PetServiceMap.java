package pw.springdev.sfgpetclinic.service.map;

import pw.springdev.sfgpetclinic.model.Pet;
import pw.springdev.sfgpetclinic.service.CrudService;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-15
 */
public class PetServiceMap extends AbstractMapService<Pet, Long>
        implements CrudService<Pet, Long> {
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
        return super.save(pet.getId(), pet);
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
