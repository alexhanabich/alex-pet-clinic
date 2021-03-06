package alex.kang.alexpetclinic.services.map;

import alex.kang.alexpetclinic.model.Owner;
import alex.kang.alexpetclinic.services.CrudService;

import java.util.Set;

public class  OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

}
