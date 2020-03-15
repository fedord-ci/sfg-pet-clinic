package pw.springdev.sfgpetclinic.service;

import pw.springdev.sfgpetclinic.model.Owner;

/**
 * Created by FedorD on 2020-03-14
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
