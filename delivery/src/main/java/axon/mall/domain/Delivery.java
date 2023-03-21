package axon.mall.domain;

import axon.mall.DeliveryApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String deliveryId;

    private String userId;

    private String address;

    private String orderId;

    private String productId;

    private Integer qty;

    private String status;

    @PostPersist
    public void onPostPersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    public void startDelivery(StartDeliveryCommand startDeliveryCommand) {
        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();
    }
}
