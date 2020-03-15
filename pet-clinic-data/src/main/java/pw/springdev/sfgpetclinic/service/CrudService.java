package pw.springdev.sfgpetclinic.service;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-15
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
