package service;
import bean.Account;
import java.util.Scanner;

abstract class AccountInit
{
	public static int acc_count=0;
	public static int acc_no=1;
	String name;
	int j,i;
	float amount;
	public Account a[]=new Account[10];
	Scanner scan = new Scanner(System.in);

	public void accountCreate()
	{	
			if(AccountInit.acc_no<10)
			{ 
				name="Unknown";
				amount=500;
				i=AccountInit.acc_no;
				a[i] = new Account(AccountInit.acc_no,name,amount);
				display(i);
				AccountInit.acc_no++;
				acc_count++;
			}
			else
			{
				System.out.println("Accounts limit is only 10");
			}
		
	} 

	public void accountCreate(String name,float amount)
	{	
		if(AccountInit.acc_no < 10)
		{

			j=AccountInit.acc_no;
			this.name = name;
			do {
				if(amount > 500) 
				{
					this.amount = amount;
				}
				else {
					System.out.println("Minimum balance Should be 500Rs ");
					
					this.amount=scan.nextFloat();
					
				}
			}while(this.amount < 500);
			

			a[j] = new Account(AccountInit.acc_no,this.name,this.amount);
			display(j);
			AccountInit.acc_no++;
			acc_count++;
		}
		else
		{
			System.out.println("Aaccount limit is only 10");
		}
	}

	void display(int i)
{
		System.out.println("Name of Account holder="+a[i].getName());
		System.out.println("Account Number ="+a[i].getAcc_no());
		System.out.println("Balance of Account Holder="+a[i].getAmount());
}

	abstract void transfer(int from_acc,int to_acc,float amount)throws NotSufficientFundException, InvalidAccountNumberException;
}
