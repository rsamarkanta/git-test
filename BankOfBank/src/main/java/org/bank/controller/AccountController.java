package org.bank.controller;

import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.CreditCard;
import org.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc")
public class AccountController {

	@Autowired
	private AccountService accService;

	// @GetMapping("/message/{name}")
	@GetMapping("/{name}")
	public String welcome(@PathVariable String name) {
		return "Hello " + name + " ! Welcome to Bank of Bank !!";
	}

	@GetMapping("/showAll")
	public List<Account> showAllCustomers() {
		List<Account> acList = accService.showAllCustomers();
		return acList;
	}

	@GetMapping("/showCards/{aid}")
	public List<CreditCard> showCardDetails(@PathVariable long aid) {
		List<CreditCard> acc=accService.fetchAccount(aid);
		
		
	//	List<CreditCard> ccList 
		
		return acc;
	}

	@PostMapping("/createAccount")
	public Account openAccount(@RequestBody Account acc) {
		return accService.createAccount(acc);
	}
}
