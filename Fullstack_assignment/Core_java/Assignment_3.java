import java.util.Scanner;

class Emp
{	

	    int n;
	    double bonus;
	    int id[];
		String name[];
		double salary[];
		String desg[];

	    Emp(int rec)
	    {
	    	this.n=rec;
	    	id=new int[rec];
	    	name=new String[rec];
	    	salary=new double[rec];
	    	desg=new String[rec];
	    }
		
		

		void read()
		{ 
			Scanner scan= new Scanner(System.in);
			System.out.println("*****Enter Employee Details*****");
			for(int i=0; i<n;i++)
			{	
				
				
				System.out.println("Enter Employee Id: ");
				id[i]=scan.nextInt();
				System.out.println("Enter Employee Name: ");
				name[i]=scan.next();
				System.out.println("Enter Employee Salary: ");
				salary[i]=scan.nextDouble();
				System.out.println("Enter Employee Designation: ");
				desg[i]=scan.next();
			}


		}

		void calSalary()
		{	

			double hra,da,pf;
			for(int i=0; i<n;i++)
			{
				da = (salary[i] * 7) / 100;
        		hra = (salary[i] * 10) / 100;
        		pf = (salary[i] * 5) / 100;
        		bonus();
        		salary[i] = salary[i] + da +bonus+ hra-pf;
        		
        		
        	}
		}

		void bonus()
		{	
			
			for(int i=0; i<n;i++)
			{
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
			}
		}

		void display()
		{
			for(int i=0; i<n;i++)
			{
				System.out.println("****Employees Details are as follows****");
        		System.out.println("");
        		System.out.println("Employee id is :"+id[i]);
        		System.out.println("Employee Name: "+name[i]);
        		System.out.println("Employee Salary is: "+salary[i]);
        		System.out.println("Employee Designation: "+desg[i]);
        	}

		}
}
class Assignment_3
{
	public static void main(String[] args) 
	{	
		System.out.println("How many Records Want to add?");
		Scanner scan= new Scanner(System.in);
		int rec=scan.nextInt();
			Emp e=new Emp(rec);
			e.read();
			e.calSalary();
			e.display();
		}
	
}