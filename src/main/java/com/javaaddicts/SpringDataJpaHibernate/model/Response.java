package com.javaaddicts.SpringDataJpaHibernate.model;

public class Response {
	
	private String accountId;
	private String firstName;
	private String lastName;
	private Integer rewards;
	
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getRewards() {
		return rewards;
	}
	public void setRewards(Integer rewards) {
		this.rewards = rewards;
	}
	
	
}
