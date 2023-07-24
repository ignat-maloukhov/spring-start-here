package demo.ignat.repository;

import demo.ignat.model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findAll();

    List<Account> findAccountsByName(String name);

    @Modifying
    @Query("UPDATE Account SET amount = :amount WHERE id = :id")
    void changeAmount(long id, BigDecimal amount);

}
