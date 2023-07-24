package demo.ignat.dto;

import java.math.BigDecimal;

public record TransferRequest(
        long senderAccountId,
        long receiverAccountId,
        BigDecimal amount) {

    @Override
    public String toString() {
        return "TransferRequest{" +
                "senderAccountId=" + senderAccountId +
                ", receiverAccountId=" + receiverAccountId +
                ", amount=" + amount +
                '}';
    }
}
