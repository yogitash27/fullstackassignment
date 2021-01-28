package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeSortById;
import service.EmployeeSortName;
import service.EmployeeSortSalary;

public class EmpTest
{

	public static void main(String[] args)
	{
		List<Employee> listOfEmp = new ArrayList<>();
			int ch;
			System.out.println("How many records want to store?");
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			for(int i=0;i<n;i++) {
			System.out.println("Enter the Id:");
			int id=input.nextInt();
			System.out.println("Enter the Name:");
			String name =input.next();
			System.out.println("Enter the Salary:");
			float salary=input.nextFloat();
			listOfEmp.add(new Employee(id, name, salary));
			}
			System.out.println("Before Sort");
			for(Employee emp : listOfEmp) 
			{
				System.out.println(emp);
			}
			
		do 
		{
			System.out.println("***Main Menu***\n1. Sort By Id\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("2. Sort By Name\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("3. Sort By Salary\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("Enter Your Choice :");
	       ch = input.nextInt();	
	       switch(ch)
           {	
           		case 1:
           					System.out.println("Enter Your Choice :");
           					int c = input.nextInt();
           					switch(c)
           					{
           					case 1: 	
         							Collections.sort(listOfEmp,new EmployeeSortById());			// using comparator 
         							System.out.println();
         							System.out.println("After Sort");
         							for(Employee emp : listOfEmp) 
         							{
         								System.out.println(emp);
         							
         							}
         							break;
         							
           					case 2: 
         							Collections.sort(listOfEmp,new EmployeeSortById());			// using comparator 
         							System.out.println();
         							System.out.println("After Sort");
         							Collections.reverse(listOfEmp);
         							for(Employee emp : listOfEmp) 
         							{
         								System.out.println(emp);
 		    	
         							}
         							break;
           					}
           					break;
           					
           		case 2:
   							System.out.println("Enter Your Choice :");
   							c = input.nextInt();
   							switch(c)
   							{
   							case 1: 	
   									Collections.sort(listOfEmp,new EmployeeSortName());			// using comparator 
   									System.out.println();
   									System.out.println("After Sort");
   									for(Employee emp : listOfEmp) 
   									{
   										System.out.println(emp);
 		    	
   									}
   									break;
 							
   							case 2: 
   									Collections.sort(listOfEmp,new EmployeeSortName());			// using comparator 
   									System.out.println();
   									System.out.println("After Sort");
   									Collections.reverse(listOfEmp);
   									for(Employee emp : listOfEmp) 
   									{
   										System.out.println(emp);
	    	
   									}
   									break;
   							}
   							break;
           		case 3:
           					System.out.println("Enter Your Choice :");
           					c = input.nextInt();
           					switch(c)
           					{
           					case 1: 	
           							Collections.sort(listOfEmp,new EmployeeSortSalary());			// using comparator 
           							System.out.println();
 							System.out.println("After Sort");
 							for(Employee emp : listOfEmp) 
 							{
 								System.out.println(emp);
 							
 							}
 							break;
 							
   					case 2: 
 							Collections.sort(listOfEmp,new EmployeeSortSalary());			// using comparator 
 							System.out.println();
 							System.out.println("After Sort");
 							Collections.reverse(listOfEmp);
 							for(Employee emp : listOfEmp) 
 							{
 								System.out.println(emp);
	    	
 							}
 							break;
   					}
   					break;
           
           		default:
        			System.out.println("");
					System.out.println("Please select correct option");
					break;
           }
	       System.out.println("Do You Want to Continue(1/0)");
	        ch=input.nextInt();
		 	}while(ch!=0);	}
}
