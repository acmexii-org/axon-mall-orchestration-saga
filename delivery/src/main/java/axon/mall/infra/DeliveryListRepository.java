package axon.mall.infra;

import axon.mall.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "deliveryLists",
    path = "deliveryLists"
)
public interface DeliveryListRepository
    extends PagingAndSortingRepository<DeliveryList, Long> {}
