package pw.springdev.sfgpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pw.springdev.sfgpetclinic.model.Vet;
import pw.springdev.sfgpetclinic.repositories.VetRepository;
import pw.springdev.sfgpetclinic.service.VetService;

import java.util.Set;

/**
 * Created by FedorD on 2020-04-05
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements VetService {

    private final VetRepository vetRepository;

    public SpecialitySDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public Vet findById(Long aLong) {
        return null;
    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
