package axon.mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryList_table")
@Data
public class DeliveryList {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
