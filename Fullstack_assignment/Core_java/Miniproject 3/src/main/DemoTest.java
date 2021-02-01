package main;
import bean.Product;
import java.sql.SQLException;
import java.util.Scanner;

import service.ProductService;

public class DemoTest
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	ProductService ps  = new ProductService();
	Product p=new Product();
	boolean flag=true;
	int ch,id;
	double price;
	String name;
	do {
		
			System.out.println("***Main Menu***\n1. Add Product\n2. Update Product\n3. Delete Product\n4. Diplay Product");
			System.out.println("5. Display Product Name By Ascending Order\n6. Display Product Name By Decending Order\n7. Display Price Low To High\n8. Diplay Price High To Low\n9.Exit");
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
        					price=scan.nextDouble();
        					p.setPid(id);
        					p.setPname(name);
        					p.setPrice(price);
        					ps.storeRecord(p);
        					break;
        			
        	 case 2:
        		 
        				System.out.println("Enter Product Id:");
        				id=scan.nextInt();
        				System.out.println("Enter Product Price:");
        				price=scan.nextFloat();
        				//p.setPid(id);
        				//p.setPrice(price);
        				ps.updateProductPrice(p);
        				break;
        			
        	case 3:
        				System.out.println("Enter Product Id:");
        				id=scan.nextInt();
        				//p.setPid(id);
        				ps.deleteProduct(p);
        				break;	
				
        	case 4:
        				ps.getAllProduct().stream().forEach(p1->System.out.println(p1));
        				break;
        				
        	case 5:
        				ps.getAllProductByAsc().stream().forEach(ap->System.out.println(ap));
        				break;
        				
         	case 6:		
         				ps.getAllProductByDes().stream().forEach(dp->System.out.println(dp));
        	 			break;
        	 			
         	case 7:
         				ps.displayPriceLow().stream().forEach(pl->System.out.println(pl));
         				break;
         				
         	case 8:
         				ps.displayPricehigh().stream().forEach(ph->System.out.println(ph));
         				break;
         				
         	case 9:
         				System.out.println("Thanks for Using Application!!!!");
         				flag=false;
         				break;
         				
         	default:
        	 			System.out.println("");
        	 			System.out.println("Please select correct option");
        	}
		}while(flag);		
	
	}

}
