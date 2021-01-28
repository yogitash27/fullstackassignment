package service;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import bean.Product;
import dao.ProductDao;

public class ProductService {	
	List<Product> listOfProduct;
	ProductDao pd;
	
	public ProductService() 
	{
			pd = new ProductDao();
	}
	
	public List<Product> getAllProduct() 
	{	
			listOfProduct = pd.getAllProduct();
			return listOfProduct;
	}
	
	public List<Product> getAllProductByAsc()
	{	
			listOfProduct = pd.getAllProduct();
			Collections.sort(listOfProduct, (p1,p2) -> (p1.getPname().compareTo(p2.getPname())));
			return listOfProduct;
	}
	
	public List<Product> getAllProductByDes() 
	{	
			listOfProduct = pd.getAllProduct();
			Collections.sort(listOfProduct, (p1,p2) -> (p2.getPname().compareTo(p1.getPname())));
			return listOfProduct;
	}
	
	public List<Product> displayPriceLow() 
	{	
			listOfProduct = pd.getAllProduct();
			Collections.sort(listOfProduct,(p1,p2)->(int) (p1.getPrice()-p2.getPrice()));
			return listOfProduct;
	}
	
	public List<Product> displayPricehigh() 
	{	
			listOfProduct = pd.getAllProduct();
			Collections.sort(listOfProduct,(p1,p2)->(int) (p2.getPrice()-p1.getPrice()));
			return listOfProduct;
	}
	
	public String storeRecord(Product p) 
	{
			if(p.getPrice()<0) {
				return "Price must be +ve";
			}else if(p.getPrice()>0 && p.getPrice()<500) {
				return "Minimum price must be > 500";
			}else if(pd.storeProductDetails(p)>0) {
				return "Record stored successfully";
			}else {
				return "Record didn't store";
			}
	}
	
	public int updateProduct(int pid,double price) throws ClassNotFoundException, SQLException 
 	{
			int r=pd.updateProduct1(pid,price);
			return r;
	}
	
	public int deleteProduct(int pid) throws ClassNotFoundException, SQLException 
 	{
			int r=pd.deleteProduct1(pid);
			return r;
	}
}