package org.bank.service;

import java.util.List;
import java.util.stream.Collectors;

import org.bank.entity.Account;
import org.bank.entity.CreditCard;
import org.bank.exception.BadCredentialException;
import org.bank.exception.IdNotFoundException;
import org.bank.exception.ResourceNotFoundException;
import org.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accRepo;

	@Override
	public Account createAccount(Account acc) {

//		List<Account> accountList = accRepo.findAll().stream().filter(
//				accs -> accs.getCustName().equalsIgnoreCase(acc.getCustName()) || accs.getMobNo() == (acc.getMobNo()))
//				.collect(Collectors.toList());
//		if (accountList.isEmpty()) {
			Account Account = accRepo.save(acc);
			return Account;
//		} else {
//			throw new BadCredentialException("Account Already exist !!");
//		}
	}

	@Override
	public Account fetchAccountDetails(Long accountNo) {
		return accRepo.findById(accountNo).orElseThrow(() -> new IdNotFoundException("Account No Not Available !!"));

	}

	@Override
	public Account updateAccount(Account acc) {

		Account account = accRepo.findById(acc.getAcNumber()).orElseThrow(() -> new IdNotFoundException());

		account.setBranchName(acc.getBranchName());

		accRepo.save(account);
		return account;
	}
//
//	@Override
//	public String deleteAccount(Long accNo) {
//		accRepo.deleteByAccountNo(accNo);
//		return "Account Deleted Successfully";
//	}

	@Override
	public List<Account> showAllCustomers() {
		List<Account> accList = accRepo.findAll();
		if (accList.isEmpty()) {
			throw new ResourceNotFoundException("Customers Details Not Available !!");
		} else {
			return accList;
		}
	}

@Override
public List<CreditCard> fetchAccount(Long aid) {
	Account ac= accRepo.findById(aid).get();
	List<CreditCard> ccList = ac.getCards();
	return ccList;
}



//	@Override
//	public Account getAccountByName(String name) {
//		Account Account = accRepo.findByName(email);
//		System.out.println("Account in service: " + Account);
//		return Account;
//	}

}
