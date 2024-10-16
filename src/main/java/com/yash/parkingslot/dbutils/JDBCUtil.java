package com.yash.parkingslot.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {

	  static final String url = "jdbc:mysql://localhost:3306/parkingslot";
	  static final String userName = "root";
	  static final String password = "root";
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Block Usage : This block will loads the MySQL driver class.
	   * 
	   */
	  
	  static
	  {
		  
		  try
		  {
			  Class.forName("com.mysql.cj.jdbc.Driver");
		  }
		  catch (ClassNotFoundException e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
		  
	  }
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Method Usage : This method will create MYSQL connection.
	   * 
	   */
	  
	  private Connection con = null;
	  
	  public Connection openConnection()
	  {
		  try
		  {
			  if(con==null)
			  {
				  con = DriverManager.getConnection(url, userName, password);
			  }
			  if(con.isClosed())
			  {
				  con = DriverManager.getConnection(url, userName, password);
			  }
		  }
		  catch (SQLException e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
		return con;
	  }
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Method Usage : This method will create Prepared statements for given query.
	   * 
	   */
	  
	  public PreparedStatement createPreparedStatement(String query)
	  {
		  try
		  {
			  return openConnection().prepareStatement(query);
		  }
		  catch (SQLException e) {
			// TODO: handle exception
			  e.printStackTrace();
			  throw new RuntimeException(e.getMessage());
		 }
	  }
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Method Usage : This method will close the PreparedStatement.
	   * 
	   */
	  
	  public void closePreparedStatement(PreparedStatement pstmt)
	  {
		  try
		  {
			  pstmt.close();
		  }
		  catch (SQLException e) {
			// TODO: handle exception
		}
	  }
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Method Usage : This method will create the ResultSet object.
	   * 
	   */
	  
	  public ResultSet createResultSet(String query)
	  {
		  try
		  {
			  return openConnection().createStatement().executeQuery(query);
		  }
		  catch (SQLException e) {
			// TODO: handle exception
			  throw new RuntimeException();
		}
	  }
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Method Usage : This method will close the ResultSet object.
	   * 
	   */
	  
	  public void closeResultSet(ResultSet rs)
	  {
		  try
		  {
			  rs.close();
		  }
		  catch (SQLException e) {
			// TODO: handle exception
		}
	  }
	  
	  /*
	   *  @Author : Manik Kore
	   *  
	   *  Method Usage : This method will close the database connection.
	   * 
	   */
	  
	  public void closeConnection()
	  {
		  try
		  {
			  con.close();
		  }
		  catch (SQLException e) {
				// TODO: handle exception
			}
	  }
	
}
