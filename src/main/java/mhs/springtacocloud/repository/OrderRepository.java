package mhs.springtacocloud.repository;

import mhs.springtacocloud.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {

}
