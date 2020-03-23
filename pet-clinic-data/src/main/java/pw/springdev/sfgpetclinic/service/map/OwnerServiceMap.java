package pw.springdev.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;
import pw.springdev.sfgpetclinic.model.Owner;
import pw.springdev.sfgpetclinic.service.OwnerService;

import java.util.Set;

/**
 * Created by FedorD on 2020-03-15
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
    implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
