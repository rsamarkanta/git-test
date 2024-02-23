package org.bank.service;

import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.CreditCard;

public interface AccountService {

	public Account createAccount(Account account);

	public Account fetchAccountDetails(Long accNo);

	public Account updateAccount(Account accNo);

	// public String deleteAccount(Long accountNo);

	public List<Account> showAllCustomers();

//	public Account getAccountByName(String name);

	public List<CreditCard> fetchAccount(Long aid);
	
	

}
