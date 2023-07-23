package demo.ignat.controller;

import demo.ignat.model.PaymentDetails;
import demo.ignat.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

    private static final Logger logger = Logger.getLogger(PaymentController.class.getName());

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestParam double amount) {

        System.out.println(amount);

        var payment = paymentService.processPayment(amount);
        logger.info("Received payment " + payment.balance());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(payment);
    }

}
