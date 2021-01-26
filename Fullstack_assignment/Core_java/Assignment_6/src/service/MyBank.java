package service;
public class MyBank extends AccountInit implements Bank1
{

	public void transfer(int from_acc, int to_acc, float amount) throws NotSufficientFundException,InvalidAccountNumberException
	{
		boolean flag = false;
		if (acc_count != 0) 
		{
				for (int i = 1; i <= acc_count; i++) 
				{
						if (from_acc == a[i].getAcc_no()) 
						{
								flag = true;
								break;
						}
						else
						{
								flag = false;
						}
				}
			  if (flag == false) 
			  {
				  	 	throw new InvalidAccountNumberException("Invalid number");
			   }
			  else
			  {
				  	float amt = a[from_acc].getAmount();
			  		float bal = amt - amount;
			  		float amt1=a[to_acc].getAmount();
			  		float bal1 = amt1 + amount;
			  		if (bal > 500)
			  		{
			  				bal = amt - amount;
			  				a[from_acc].setAmount(bal);

			  				bal1 = amt1 + amount;
			  				a[to_acc].setAmount(bal1);
			  		} 
			  		else
			  		{
			  				throw new NotSufficientFundException("Balance is insufficient you can't transfer");
			  		}	
			 }
		}
	}

	public void withdraw(int acc_no, float amount)throws NotSufficientFundException,InvalidAccountNumberException
	{
		boolean flag = false;
		if (acc_count != 0) 
		{
				for (int i = 1; i <= acc_count; i++) 
				{
						if (acc_no == a[i].getAcc_no()) 
						{
								flag = true;
								break;
						}
						else
						{
								flag = false;
						}
				}
			  if (flag == false) 
			  {
				  	 	throw new InvalidAccountNumberException("Invalid number");
			   }
			  else
			  	{
				  		float amt = a[acc_no].getAmount();
				  		float bal = amt-amount;
				  		if(bal > 500) 
				  		{
				  				bal = amt-amount;
				  				a[acc_no].setAmount(bal);
				  		}
				  		else 
				  		{
				  			throw new NotSufficientFundException("Balance is insufficient you can't Withdraw ");
				  		}	
			  }
		}
	}

	public void deposit(int acc_no, float amount) throws InvalidAccountNumberException{
		boolean flag = false;
		if (acc_count != 0)
		{
					for (int i = 1; i <= acc_count; i++) 
					{
						if (acc_no == a[i].getAcc_no()) 
						{
							flag = true;
							break;
						}
						else 
						{
							flag = false;
						}
					}
				if (flag == false) 
				{
						throw new InvalidAccountNumberException("Invalid number");
				} 
				else 
				{
						float amt = a[acc_no].getAmount();
						float bal = amt + amount;
						a[acc_no].setAmount(bal);
				}
			}
		}

	public void checkBalance(int acc_no) throws InvalidAccountNumberException {
		boolean flag = false;
		if (acc_count != 0)
		{
					for (int i = 1; i <= acc_count; i++) 
					{
						if (acc_no == a[i].getAcc_no()) 
						{
							flag = true;
							break;
						}
						else 
						{
							flag = false;
						}
					}
				  if (flag == false) 
				  {
						throw new InvalidAccountNumberException("Invalid number");
				  } 
				  else 
				  {
						String name = a[acc_no].getName();
						float amount = a[acc_no].getAmount();
						System.out.println("Name=" + name);
						System.out.println("Amount=" + amount);
				}
			}
	}
}