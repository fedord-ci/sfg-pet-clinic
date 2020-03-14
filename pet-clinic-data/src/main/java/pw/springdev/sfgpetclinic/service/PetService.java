package pw.springdev.sfgpetclinic.service;

import pw.springdev.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-14
 */
public interface PetService {

    Pet findById(Long is);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
