package axon.mall.infra;

import axon.mall.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/deliveries")
@Transactional
public class DeliveryController {

    @Autowired
    DeliveryRepository deliveryRepository;

    @RequestMapping(
        value = "deliveries/",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public Delivery startDelivery(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody Delivery delivery
    ) throws Exception {
        System.out.println("##### /delivery/startDelivery  called #####");
        delivery.startDelivery(startDeliverycommand);
        deliveryRepository.save(delivery);
        return delivery;
    }
}
