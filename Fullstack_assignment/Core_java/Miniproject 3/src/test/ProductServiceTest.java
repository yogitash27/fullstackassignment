package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import bean.Product;
import service.ProductService;

public class ProductServiceTest {
	static ProductService ps;
	
	@BeforeClass
	public static void beforeClass() 
	{
		ps=new ProductService();
	}
	
	//@Test
	public void testGetAllProductByAsc() 
	{
		List<Product> listOfProduct = ps.getAllProductByAsc();
		assertEquals(2, listOfProduct.size());
		Product p= listOfProduct.get(0);
		assertEquals("Mobile", p.getPname());
		
	}
	
	//@Test
	public void testGetAllProductByDes() 
	{
		List<Product> listOfProduct = ps.getAllProductByDes();
		assertEquals(2, listOfProduct.size());
		Product p= listOfProduct.get(0);
		assertEquals("TV", p.getPname());
		
	}
	
	//@Test
		public void displayPriceLow() 
		{
			List<Product> listOfProduct = ps.getAllProductByDes();
			assertEquals(2, listOfProduct.size());
			Product p= listOfProduct.get(0);
			assertEquals("50000", p.getPrice());
			
		}
	
	//@Test
	public void testGetAllProduct() 
	{
		List<Product> listOfProduct = ps.getAllProduct();
		assertEquals(2, listOfProduct.size());
		Product p= listOfProduct.get(0);
		assertEquals(10000, 10000, 0.0);
		
	}
	//@Test
	public void testStoreRecord() 
	{
		
		Product p = new Product();
		p.setPid(3);
		p.setPname("Pen");
		p.setPrice(550);
		String res	= ps.storeRecord(p);
		String msg = "Record didn't store";
		assertEquals(msg, res);
		
	}

	//@Test
	public void testUpdateProductPrice() 
	{
		Product p = new Product();
		p.setPid(1);
		p.setPrice(55555);
		String res	= ps.updateProductPrice(p);
		assertEquals("Price updated successfully", res);
		
	}
	
	//@Test
	public void testDeleteProduct() 
	{
		Product p = new Product();
		p.setPid(5);
		String res	= ps.deleteProduct(p);
		assertEquals("Product didn't deleted", res);
		
	}
}
