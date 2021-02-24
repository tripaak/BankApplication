package tripathi.akash.account.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import tripathi.akash.account.model.Account;

class AccountDAOTest {
	
	private DriverManagerDataSource dataSource;
	private AccountDAO dao;

	@Test
	void testCreateAccount() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/bankapp");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		dao = new AccountDAOImpl(dataSource);
		
		Account account = new Account("Vibha",1566791901,2010);
		
		int result = dao.createAccount(account);
		assertTrue(result > 0);
	}

}
