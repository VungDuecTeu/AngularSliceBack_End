package dev.slice.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.slice.entities.Account;
import dev.slice.repositories.AccountRepo;

@Component
@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepo ar;
	
	@Override
	public Account createAccount(Account account) {
		ar.save(account);
		return account;
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accounts = (List<Account>)ar.findAll(); 
				//new ArrayList<Account>((Collection<? extends Account>) ar.findAll());
		return accounts;
	}

	@Override
	public Account getAccountById(int id) {
		return ar.findById(id).get();
	}

	@Override
	public boolean deleteAccount(Account account) {
		ar.delete(account);
		return true;
	}

	@Override
	public Account updateAccount(Account account) {
		account = ar.save(account);
		return account;
	}

}
