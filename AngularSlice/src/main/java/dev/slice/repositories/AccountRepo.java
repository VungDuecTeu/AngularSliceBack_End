package dev.slice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dev.slice.entities.Account;

@Component
@Repository
public interface AccountRepo extends CrudRepository<Account, Integer> {
	
////	// create
//	Account createAccount(Account account);
////	
////	// read
//	Account getAccountById(int id);
//	Set<Account> getAllAccounts();
////	
////	// update
//	Account updateAccount(Account account);
////	
////	// delete
//	boolean deleteAccount(Account account);
	Account findByUsername(String username);
}
