package org.bank.entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANK")
public class Account {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long aid;
	private String custName;
	private Date doj;
	private long acNumber;
	private long mobNo;
	private String acType;
	private long balance;
	private String ifscCode;
	private String branchName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "account")
	@JsonManagedReference
	private List<CreditCard> cards;

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public long getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(long acNumber) {
		this.acNumber = acNumber;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<CreditCard> getCards() {
		return cards;
	}

	public void setCards(List<CreditCard> cards) {
		this.cards = cards;
	}

	public Account(long aid, String custName, Date doj, long acNumber, long mobNo, String acType, long balance,
			String ifscCode, String branchName, List<CreditCard> cards) {
		super();
		this.aid = aid;
		this.custName = custName;
		this.doj = doj;
		this.acNumber = acNumber;
		this.mobNo = mobNo;
		this.acType = acType;
		this.balance = balance;
		this.ifscCode = ifscCode;
		this.branchName = branchName;
		this.cards = cards;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", custName=" + custName + ", doj=" + doj + ", acNumber=" + acNumber + ", mobNo="
				+ mobNo + ", acType=" + acType + ", balance=" + balance + ", ifscCode=" + ifscCode + ", branchName="
				+ branchName + ", cards=" + cards + "]";
	}

}
