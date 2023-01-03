package ua.edu.ucu.apps.demo.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/payment")
@RestController
public class PaymentController {
    @GetMapping
    public List<? extends Payment> getPayments(){
        return List.of(new PayPalPayment());
    }
}