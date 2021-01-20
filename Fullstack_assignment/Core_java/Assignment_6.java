import java.util.Scanner;

abstract class AccountInit
{
	public static int acc_count=0;
	public static int acc_no=1;
	String name;
	int j,i;
	float amount;
	public Account a[]=new Account[10];

	void accountCreate()
	{	
			if(AccountInit.acc_no<10)
			{ 
				name="Unknown";
				amount=500;
				i=AccountInit.acc_no;
				a[i] = new Account(AccountInit.acc_no,name,amount);
				display(i);
				AccountInit.acc_no++;
			}
			else
			{
				System.out.println("Accounts limit is only 10");
			}
		
	} 

	void accountCreate(String name,float amount)
	{	
		if(AccountInit.acc_no < 10)
		{

			j=AccountInit.acc_no;
			this.name = name;
			this.amount = amount;
			a[j] = new Account(AccountInit.acc_no,this.name,this.amount);
			AccountInit.acc_no++;
			display(j);
			acc_count++;
		}
		else
		{
			System.out.println("Aaccount limit have only 10");
		}
	}

	void display(int i)
{
		System.out.println("Name of Account holder="+a[i].getName());
		System.out.println("Account Number ="+a[i].getAcc_no());
		System.out.println("Balance of Account Holder="+a[i].getAmount());
}

	abstract void transfer(int from_acc,int to_acc,float amount);
}


interface Bank1
{
	void withdraw(int acc_no,float amount);
	void deposit(int acc_no,float amount);
	void checkBalance(int acc_no);
}


 class Account 
 {
	private int acc_no;
	private String name;
	private float amount;

	/*public Account() {
		super();
	}*/
		
	public Account(int acc_no, String name, float amount) {
		//super();
		this.acc_no = acc_no;
		this.name = name;
		this.amount = amount;
	}
	public int getAcc_no() {
		return acc_no;
	}
	
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
}

class MyBank extends AccountInit implements Bank1
{	
	Scanner scan = new Scanner(System.in);

	void transfer(int from_acc,int to_acc,float amount)
	{	
		float amt = a[from_acc].getAmount();
		float bal = amt-amount;
		if(bal > 500) {
			bal = amt-amount;
			a[from_acc].setAmount(bal);

			float bal1 = amt+amount;
			a[to_acc].setAmount(bal1);
		}
		else {
			System.out.println("balnce is insufficiant you can't transfer");
		}
		
	}
		
     
   public void withdraw(int acc_no,float amount)
	{
		float amt = a[acc_no].getAmount();
		float bal = amt-amount;
		if(bal > 500) {
			bal = amt-amount;
			a[acc_no].setAmount(bal);
		}
		else {
			System.out.println("balnce is insufficiant you can't widraw");
		}	
		
	}

	public void deposit(int acc_no,float amount)
	{	
		float amt = a[acc_no].getAmount();
		float bal = amt+amount;
		a[acc_no].setAmount(bal);
	
	}

	public void checkBalance(int acc_no)
	{
		String name = a[acc_no].getName();
		float amount= a[acc_no].getAmount();
		System.out.println("Name="+name);
		System.out.println("Amount="+amount);
		
	}
}
class Assignment_6
{
	
	 public static void main(String[] args) 
	 {
	 	Scanner scan=new Scanner(System.in);
	 	MyBank m=new MyBank();
	 	int ch,acc_no;
	 	float amount=0.0f;
		do
		{
			System.out.println("***Main Menu***\n1. Create Account\n   1. Default Details\n   2. Name and Amount");
			System.out.println("2. Check Account Balance\n3. Deposit\n4. Withdrawal\n5. Transfer\n6.Exit");
            System.out.println("Enter Your Choice :");
            ch = scan.nextInt();
            switch(ch)
            {	
            	case 1:
            			 System.out.println("Enter Your Choice :");
           				 int c = scan.nextInt();
            			 switch(c)
            			{
            				case 1: 
            						m.accountCreate();
            						break;

            				case 2: 
   									System.out.println("Enter Name:");
									String name=scan.next();
									System.out.println("Enter Amount Greater than 500:");
									amount=scan.nextFloat();
									if(amount<500)
									{
										System.out.println("Account not created");
									}
            						m.accountCreate(name,amount);
            						break;
            			}
            			break;

            	case 2: System.out.println("Enter Account Number: ");
						acc_no=scan.nextInt();
						m.checkBalance(acc_no);
						break;

            	case 3:	System.out.println("Enter Account Number: ");
						acc_no=scan.nextInt();
						System.out.println("Enter your amount: ");
						amount=scan.nextFloat();
						if(amount>50000)
    					{
    						System.out.println("Can't Deposit More than 50,0000");
    					}		
						m.deposit(acc_no,amount);
						
						break;

            	case 4: System.out.println("Enter Account Number: ");
						acc_no=scan.nextInt();
						System.out.println("Enter your amount: ");
						amount=scan.nextFloat();
						m.withdraw(acc_no,amount);

            			break;

            	case 5:

            			System.out.println("Enter Account Number from whom transfer money: ");
						int from_acc=scan.nextInt();
						System.out.println("Enter Account Number To Whom transfer money : ");
						int to_acc=scan.nextInt();
						System.out.println("Enter your amount want to transfer=");
						amount=scan.nextFloat();
						m.transfer(from_acc,to_acc,amount);

						break;

            	case 6:
            			System.exit(0);
            			break;

            	default:
            			System.out.println("");
						System.out.println("Please select correct option");

            }
        System.out.println("Do You Want to Continue(1/0)");
        ch=scan.nextInt();
	 	}while(ch!=0);
		
	}
}