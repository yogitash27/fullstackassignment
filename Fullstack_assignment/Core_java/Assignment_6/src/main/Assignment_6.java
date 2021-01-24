package main;
import service.MyBank;
import java.util.Scanner;

class Assignment_6
{
	
	 public static void main(String[] args) throws Exception
	 {
	 	Scanner scan=new Scanner(System.in);
	 	MyBank m=new MyBank();
	 	int ch,acc_no;
	 	boolean flag=true;
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
            		System.out.println("Thanks for Using Bank Application");
        			flag=false;
        			break;

            	default:
            			System.out.println("");
						System.out.println("Please select correct option");

            }
	 	}while(flag);
		
	}
}