package alex.kang.alexpetclinic.services;

import alex.kang.alexpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
