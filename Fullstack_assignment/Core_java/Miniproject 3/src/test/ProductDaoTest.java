package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import bean.Product;
import dao.ProductDao;
import service.ProductService;

public class ProductDaoTest {
	static ProductDao pd;
	
		@BeforeClass
		public static void setUpBeforeClass() throws Exception 
		{
			pd = new ProductDao();
		}
		
		//@Test
		public void testGetAllProduct() 
		{
			assertEquals(2,pd.getAllProduct().size());
		}

		//@Test
		public void testStoreProductDetails() 
		{
			Product p = new Product();
			p.setPid(3);
			p.setPname("Pen");
			p.setPrice(550);
			assertEquals(false,pd.storeProductDetails(p));
		}

		//@Test
		public void testDeleteProduct1() 
		{
			Product p = new Product();
			p.setPid(5);
			assertEquals(true,pd.deleteProduct1(p));
		}
		
		//@Test
		public void testUpdateProductPrice() 
		{
			Product p = new Product();
			p.setPid(1);
			p.setPrice(55555);
			assertEquals(true,pd.updateProductPrice(p));
			
		}
}
