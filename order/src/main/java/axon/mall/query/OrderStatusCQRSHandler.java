package axon.mall.query;

import axon.mall.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ProcessingGroup("orderStatus")
public class OrderStatusCQRSHandler {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @QueryHandler
    public List<OrderStatus> handle(OrderStatusQuery query) {
        return orderStatusRepository.findAll();
    }
}
