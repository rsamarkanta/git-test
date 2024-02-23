package org.bank.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CARD")
public class CreditCard {
	@Id
	private Long cardNumber;
	private String cardType;
	private String cardStatus;
	private Double balance;
	@ManyToOne
	@JoinColumn(name = "aid")
	@JsonBackReference
	private Account account;
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public CreditCard(Long cardNumber, String cardType, String cardStatus, Double balance, Account account) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.cardStatus = cardStatus;
		this.balance = balance;
		this.account = account;
	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardType=" + cardType + ", cardStatus=" + cardStatus
				+ ", balance=" + balance + ", account=" + account + "]";
	}

	

}
