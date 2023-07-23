package demo.ignat.service;

import demo.ignat.exception.NotEnoughMoneyException;
import demo.ignat.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(double value) {
        if (value < 0) {
            throw new NotEnoughMoneyException();
        } else {
            return new PaymentDetails(value);
        }
    }
}
