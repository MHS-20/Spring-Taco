package mhs.springtacocloud.repository;

import mhs.springtacocloud.model.TacoOrder;
import org.springframework.stereotype.Repository;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);

}
