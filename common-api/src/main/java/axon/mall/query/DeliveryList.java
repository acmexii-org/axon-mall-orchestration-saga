package axon.mall.query;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.hateoas.server.core.Relation;

@Entity
@Table(name = "DeliveryList_table")
@Data
@Relation(collectionRelation = "deliveryLists")
public class DeliveryList {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
