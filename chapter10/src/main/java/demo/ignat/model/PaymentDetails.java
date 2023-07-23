package demo.ignat.model;

public record PaymentDetails(double balance) {

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "balance=" + balance +
                '}';
    }
}
