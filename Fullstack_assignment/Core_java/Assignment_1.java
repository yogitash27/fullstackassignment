import java.util.Scanner;
class Assignment_1
{
	
	public static void main(String[] args) 
	{	
		int ch;
		int total1=0;
		int total2=0;
		int total3=0;
		int bonus=10;
		int grand_total=0;
		boolean arr[]={false,false,false};


		
		System.out.println("***Welcome To the Online Exam***");
		do{
		
			System.out.println("Press 1 for English Exam");
			System.out.println("Press 2 for Math Exam");
			System.out.println("Press 3 for GK Exam");
			//System.out.println("Press 0 for result");
			Scanner scan= new Scanner(System.in);
			int choice= scan.nextInt();
			switch(choice)
			{
				case 1:
				
				System.out.println("");
				System.out.println("Welcome To the English Quiz");
				System.out.println("Q1.The first letter of the first word in a sentence should be");
				System.out.println("1. a large letter  2. a capital letter");
				int op1=scan.nextInt();
				System.out.println("Q2. The order of a basic positive sentence is");
				System.out.println("1. Subject-Verb-Object  2. Verb-Object-Subject");
				int op2=scan.nextInt();
				System.out.println("Q3. Every sentence must have a subject and");
				System.out.println("1. a verb  2. an object");
				int op3=scan.nextInt();
				
				
				if(op1==2 && op2==1 && op3==1)
				{
					total1=30;				

				}
				else if(op1==2 && op2==1 || op2==1 && op3==1 || op1==2 && op3==1)
				{
					total1=20;
				}
				else if(op1==2 || op2==1|| op3==1)
				{
					total1=10;
				}
				else
				{
					System.out.println("Try again");
				}
				
				System.out.println("Marks of English Quiz="+total1);
				arr[0]=true;
				break;

				case 2:
				System.out.println("");
				System.out.println("Welcome To the Math Exam");
				System.out.println("");
				System.out.println("Q1 What is 7% equal to?");
				System.out.println("1. 0.007 2. 0.07");
				int m1=scan.nextInt();
				System.out.println("Q2. I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number?");
				System.out.println("1. 77  2. 71");
				int m2=scan.nextInt();
				System.out.println("Q3. What is the square of 15?");
				System.out.println("1. a 225 2. 252");
				int m3=scan.nextInt();
				
				
				if(m1==2 && m2==1 && m3==1)
				{
					total2=30;				

				}
				else if(m1==2 && m2==1 || m2==1 && m3==1 || m1==2 && m3==1)
				{
					total2=20;
				}
				else if(m1==2 || m2==1|| m3==1)
				{
					total2=10;
				}
				else
				{
					System.out.println("Try again");
				}
				
				System.out.println("Marks of Math Quiz="+total2);
				arr[1]=true;
				break;

				case 3:
				System.out.println("");
				System.out.println("Welcome To the GK Exam");
				System.out.println("");
				System.out.println("Q1.Among the following who has cancelled their scheduled visit to India?");
				System.out.println("1.Joe Biden  2. Boris Jhonson");
				int g1=scan.nextInt();
				System.out.println("Q2. Which of the following viruses is the cause of Avian Influenza?");
				System.out.println("1. H5N1 Virus  2. fluenza Virus");
				int g2=scan.nextInt();
				System.out.println("Q3. Where will the 51st International Film Festival be held?");
				System.out.println("1. Goa  2. Mumbai");
				int g3=scan.nextInt();

				if(g1==2 && g2==1 && g3==1)
				{
					total3=30;				

				}
				else if(g1==2 && g2==1 || g2==1 && g3==1 || g1==2 && g3==1)
				{
					total3=20;
				}
				else if(g1==2 || g2==1|| g3==1)
				{
					total3=10;
				}
				else
				{
					System.out.println("Try again");
				}
				
				System.out.println("Marks of GK Quiz="+total3);
			    System.out.println("");
			    	arr[2]=true;
			    	break;

				default:
				System.out.println("");
				System.out.println("Please select correct option");
			}
			if(arr[0]==true && arr[1]==true && arr[2]==true)
			{
				System.out.println("Already visited");
			}
			else{
					System.out.println("Please visit remaining Quiz");
			}

			System.out.println("Do you want to continue? Press(1/0)");
			ch=scan.nextInt();
			

		}while(ch>0&& ch<4);

		System.out.println("Result");
				grand_total=total1+total2+total3;
			    if(grand_total>=70)
			    	{	
			    		grand_total=grand_total+bonus;
			    		System.out.println(grand_total);
			    		if(grand_total>=90)
			    		{
			    			System.out.println("Congratulations!! You are selected");
			    		}
			    		else
			    	{
			    		System.out.println("Better luck next time!!");
			    	}
			    	}
			    	else
			    	{
			    		System.out.println("Better luck next time!!");
			    	}

	}
}