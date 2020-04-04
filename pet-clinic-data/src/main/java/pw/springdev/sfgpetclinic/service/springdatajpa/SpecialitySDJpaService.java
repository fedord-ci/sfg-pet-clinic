package pw.springdev.sfgpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pw.springdev.sfgpetclinic.model.Speciality;
import pw.springdev.sfgpetclinic.repositories.SpecialityRepository;
import pw.springdev.sfgpetclinic.service.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by FedorD on 2020-04-05
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
