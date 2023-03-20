package axon.mall.event;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderPlacedEvent {

    private Long id;
}
