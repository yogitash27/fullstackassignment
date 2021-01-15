import java.util.Scanner;
class Assignment_2
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("How many Records Want to add?");
		int rec=scan.nextInt();
		int []id=new int[100];
		String []name=new String[100];
		double []salary=new double[100];
		String []desg=new String[100];

		double hra,da,pf,bonus;
		int i;


		
		for(i=1; i<=rec;i++)
		{
			System.out.println("*****Enter Employee Details*****");
			System.out.println("Enter Employee Id: ");
			id[i]=scan.nextInt();
			System.out.println("Enter Employee Name: ");
			name[i]=scan.next();
			System.out.println("Enter Employee Salary: ");
			salary[i]=scan.nextDouble();
			System.out.println("Enter Employee Designation: ");
			desg[i]=scan.next();

			if(desg[i]=="manager")
       		{
        		bonus=(salary[i]*15)/100;
        	}
        	else if(desg[i]=="developer")
        	{
        		bonus=(salary[i]*10)/100;
        	}
        	else
        	{
        		bonus=(salary[i]*5)/100;
        	}
			da = (salary[i] * 7) / 100;
        	hra = (salary[i] * 10) / 100;
        	pf = (salary[i] * 5) / 100;
        	salary[i] = salary[i] + da +bonus+ hra-pf;
        	
        	System.out.println("Employees Details are as follows");
        	System.out.println("");
        	System.out.println("Employee id is :"+id[i]);
        	System.out.println("Employee Name: "+name[i]);
        	System.out.println("Employee Salary is: "+salary[i]);
        	System.out.println("Employee Designation: "+desg[i]);
		}


	}
}