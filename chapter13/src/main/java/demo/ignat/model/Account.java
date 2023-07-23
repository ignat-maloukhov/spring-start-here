package demo.ignat.model;

import java.math.BigDecimal;

public record Account(long id, String name, BigDecimal amount) {

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
