//<<<<<<< HEAD
package com.yash.parkingallocationsystem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.parkingallocationsystem.daoimpl.AdminDaoImpl;
import com.yash.parkingallocationsystem.util.DatabaseUtil;


public class AdminDao {

	public DatabaseUtil jdbcc;
	
	public  List<Admin> getDetails(String name,int id) {
		String Daonamee;
		Integer Daoid;
	List<Admin> admins=new ArrayList<>();
    String query = "select * from admin where id="+id;
    PreparedStatement statement=jdbcc.createPreparedStatement(query);
    System.out.println(query);
	
    ResultSet resultset=jdbcc.createResultSet(query);
    try 
    {
    	while(resultset.next())
    	{
    		String namee=resultset.getString(1);
    		int idd=resultset.getInt(2);
    		System.out.println(name+" "+idd);
    		
    		AdminDaoImpl ad=new AdminDaoImpl();
    		ad.setId(idd);
    		ad.setName(namee);
    		
    	}
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    return admins;
	}

}
class Admin {
    private String name;
    private Integer id;

    public Admin(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
//=======
//package com.yash.parkingallocationsystem.dao.dao;
//
//public interface AdminDao {
//}
//>>>>>>> 2d914dca3cfa4236f32c194e0f40cf66fcab1427
