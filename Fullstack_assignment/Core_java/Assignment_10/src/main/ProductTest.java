package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import bean.Product;
import service.ProductService;
import java.io.*;

class ProductTest
{
	
	public static void main(String[] args) throws Exception
	 {
		 List<Product> pro1=new ArrayList<>();
		 int id;
		 String name;
		 float price;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		ProductService ps=new ProductService();
		Product p;
	 	boolean flag=true;
	 	int ch;
	 	
			do {
				
			System.out.println("***Main Menu***\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Diplay Product\n5. Product Price\n6.Exit");
            System.out.println("Enter Your Choice :");
            ch = scan.nextInt();	
            switch(ch)
            {	
            	case 1: 	
            				System.out.println("Enter Product Id:");
            				id=scan.nextInt();
            				System.out.println("Enter Product Name:");
            				name=scan.next();
            				System.out.println("Enter Product Price:");
            				price=scan.nextFloat();
            				ps.addProduct(id,name,price);
            				/*if(flag1==1)
                			{
                				System.out.println("Product Added succesfully");
                			}
                			else {
                				System.out.println("Please Enter Correct Product Id");
                			}*/
            				break;

            case 2: 	
            		
            			System.out.println("Enter Product Id:");
            			id=scan.nextInt();
            			System.out.println("Enter Product Price:");
            			price=scan.nextFloat();
            			p=ps.updateProduct(id,price);
            			try {
            			System.out.println("Product Id="+p.getPid());
						System.out.println("Product Name="+p.getPname());
						System.out.println("Product Price="+p.getPrice());
						System.out.println("Product Updated Succesfully");
            			}catch(Exception e)
            			{
            				System.out.println("Please Enter Correct Product Id");
            			}
						break;

            case 3:	
            			System.out.println("Enter Product Id:");
            			id=scan.nextInt();
            			int flag11=ps.deleteProduct(id);
            			if(flag11==1)
            			{
            				System.out.println("Product Deleted succesfully");
            			}
            			else {
            				System.out.println("Please Enter Correct Product Id");
            			}
						break;

            case 4: 
            			pro1=ps.diplayProduct();
            			System.out.println("**All Products**");
            			System.out.println("ID \t Name \tSalary");
            			ps.diplayProduct();
        				for(Product i1 : pro1) 
        				{
        					System.out.println(i1.getPid()+"  \t"+i1.getPname()+"\t\t"+i1.getPrice());
        				}
        				break;

            case 5:	
        	   			System.out.println("Enter Product Id:");
        	   			id=scan.nextInt();
        	   			try {
        	   			float price1=ps.productPrice(id);
        	   			System.out.println("Product Price is :"+" "+price1);
        	   			}catch(Exception e)
        	   			{
        	   				System.out.println("Please Enter Correct Product Id");
        	   			}
						break;

            case 6:
            			System.out.println("Thanks for Using Application!!!!");
            			flag=false;
            			break;

            default:
            			System.out.println("");
						System.out.println("Please select correct option");
						break;

            }
	 	}while(flag);
			
}		
}