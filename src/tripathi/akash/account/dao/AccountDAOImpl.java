package tripathi.akash.account.dao;

import javax.sql.DataSource;

import tripathi.akash.account.model.Account;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDAOImpl implements AccountDAO {
	
	private JdbcTemplate jdbcTemplate; 
	
	public AccountDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override //? 
	public int createAccount(Account a) {
		String sql = "INSERT INTO account (acc_owner,acc_number,pin) VALUES(?,?,?) ";
		return jdbcTemplate.update(sql,a.getAccoutowner(),a.getAccountnumber(),a.getPin());
		
	}

}
