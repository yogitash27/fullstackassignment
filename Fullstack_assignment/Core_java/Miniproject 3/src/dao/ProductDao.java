package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import bean.Product;
import resource.DbResource;

public class ProductDao {
Connection con;
PreparedStatement pstmt;
ResultSet rs;
Statement stmt;

	public List<Product> getAllProduct() throws ArrayIndexOutOfBoundsException
	{
			List<Product> listOfProduct = new ArrayList<>();
			try
			{
				con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("select * from product");
				rs = pstmt.executeQuery();
				while(rs.next()) 
				{
					Product p  = new Product();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getFloat(3));
					listOfProduct.add(p);
				}
			} catch (SQLIntegrityConstraintViolationException e) {
					System.out.println("Primary key issue "+e);
			} catch (SQLException e) {
					System.err.println("SQL Related Exception "+e);
			}
			return listOfProduct;
	}
	
	public int storeProductDetails(Product pp) 
	{
			try 
			{
				con = DbResource.getDbConnection();
				pstmt = con.prepareStatement("insert into product values(?,?,?)");
				pstmt.setInt(1, pp.getPid());
				pstmt.setString(2, pp.getPname());
				pstmt.setDouble(3, pp.getPrice());
				//pstmt.setDate(4, Date.valueOf(pp.getStoreDate()));		// converting LocalDate into SQL Date format
				int res = pstmt.executeUpdate();
				return res;
			} catch (SQLException e) 
			{
				System.err.println("SQL Related Exception "+e);
				return 0;
			}
	}
	
	public int updateProductPrice(Product pp) {
		try {
			con = DbResource.getDbConnection();
			pstmt = con.prepareStatement("update Product set price = ? where pid=?");
			pstmt.setDouble(1, pp.getPrice());
			pstmt.setInt(2, pp.getPid());
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.err.println("SQL Related Exception "+e);
			return 0;
		}
		
	}
	public int deleteProduct1(Product pp)
	{
		
		try {
				con = DbResource.getDbConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
		        pstmt.setInt(1,pp.getPid()); 
		        int res=pstmt.executeUpdate();
		        return res;
				} catch (SQLException e) 
				{
					System.err.println("SQL Related Exception "+e);
					return 0;
				}
	
	}
}
