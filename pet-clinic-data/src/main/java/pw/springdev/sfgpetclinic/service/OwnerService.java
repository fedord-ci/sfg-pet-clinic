package pw.springdev.sfgpetclinic.service;

import pw.springdev.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-14
 */
public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long is);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
