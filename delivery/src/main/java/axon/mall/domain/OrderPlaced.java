package axon.mall.domain;

import axon.mall.domain.*;
import axon.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private String orderId;
    private String productName;
    private String productId;
    private String status;
    private Integer qty;
    private String userId;
}
