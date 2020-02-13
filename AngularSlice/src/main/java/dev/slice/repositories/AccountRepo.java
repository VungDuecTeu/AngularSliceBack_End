package dev.slice.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import dev.slice.entities.Account;

@Repository
public interface AccountRepo {
	
	// create
	Account createAccount(Account account);
	
	// read
	Account getAccountById(int id);
	Set<Account> getAllAccounts();
	
	// update
	Account updateAccount(Account account);
	
	// delete
	boolean deleteAccount(Account account);
}