package demo.ignat.repository.mapper;

import demo.ignat.model.Account;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Account(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getBigDecimal("amount"));
    }
}
