package org.bank.repository;

import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
//	public void deleteByAccountNo(Long accountNo);

}
