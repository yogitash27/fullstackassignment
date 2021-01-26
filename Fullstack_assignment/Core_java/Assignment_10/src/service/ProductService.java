package service;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import bean.Product;
import java.io.*;

@SuppressWarnings("serial")
public class ProductService implements Serializable
{
	 	List<Product> pro1=new ArrayList<>();
	 	Product j;
	 	
	 	public List<Product> diplayProduct()
	 	{
	 		return pro1;
	 	}

	 	public void addProduct(int pid, String pname, float price) 
	 	{
	 			Product p=new Product();
				p.setPid(pid);
				p.setPname(pname);
				p.setPrice(price);
				try 
				{
				pro1.add(p);
				FileOutputStream fout=new FileOutputStream("info.txt");  
			 	ObjectOutputStream out=new ObjectOutputStream(fout);  
			 	out.writeObject(pro1);  
			 	out.flush(); 
			 	 out.close();    
			 	  }
				catch(Exception e)
				{System.out.println(e);
				}  

	 	}
	 	public Product updateProduct(int pid, float price) 
	 	{
	 		for(Product i:pro1) {
	 			if(pid==i.getPid()) 
	 			{
	 				i.setPrice(price);
	 				j=i;
	 			}
	 		}
	 		return j;
	 	}
	 	
	 	public int deleteProduct(int pid) 
	 	{
	 		int flag=0;
	 		for(Product i:pro1) 
	 		{
	 			if(pid==i.getPid()) {
	 				j=i;
	 			flag=1;
	 			}
	 		}
	 		if(flag==1) {
				pro1.remove(j);
				return 1;
			}else {
				return 0;
			}
		
	 	}
	 	
	 	public float productPrice(int pid) 
	 	{
	 		for(Product i:pro1)
	 		{
	 			if(pid==i.getPid()) 
	 			{
	 				i.getPrice();
	 				j=i;
	 			}
	 	}
	 		return j.getPrice();
	 	}
}