package pw.springdev.sfgpetclinic.service;

import pw.springdev.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-14
 */
public interface VetService {

    Vet findById(Long is);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
