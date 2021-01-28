package service;

public interface Bank1
{
	void withdraw(int acc_no,float amount)throws NotSufficientFundException,InvalidAccountNumberException;
	void deposit(int acc_no,float amount)throws InvalidAccountNumberException;
	void checkBalance(int acc_no)throws InvalidAccountNumberException;
}