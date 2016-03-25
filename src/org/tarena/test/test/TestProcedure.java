package org.tarena.test.test;


import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.PreparedStatement;
import org.apache.commons.beanutils.BeanUtils;


public class TestProcedure {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager
				    .getConnection("jdbc:mysql://192.168.13.192:3306/rainbow_3_0?user=root&password=123456");
			long start = System.currentTimeMillis();
			 String sql = "select FUN_NE_GETALLNAMEPATH(1444)";
			 PreparedStatement cs = null;
			 for(int i=1;i<1000;i++){
				 cs = (PreparedStatement)con.prepareCall(sql);
				 cs.execute();
				 ResultSet set = cs.getResultSet();
			 }
//			if(set.next()){
//				System.out.println(set.getString(1));
//			}
			 long end = System.currentTimeMillis();
			 System.out.println(end - start);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	 // Map --> Bean 2: 利用org.apache.commons.beanutils 工具类实现 Map --> Bean  
    public static void transMap2Bean2(Map<String, Object> map, Object obj) {
        if (map == null || obj == null) {  
            return;  
        }  
        try {  
            BeanUtils.populate(obj, map);
        } catch (Exception e) {  
            System.out.println("transMap2Bean2 Error " + e);  
        }  
    }  
  
    // Map --> Bean 1: 利用Introspector,PropertyDescriptor实现 Map --> Bean  
    public static void transMap2Bean(Map<String, Object> map, Object obj) {  
  
        try {  
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
  
            for (PropertyDescriptor property : propertyDescriptors) {  
                String key = property.getName();  
  
                if (map.containsKey(key)) {  
                    Object value = map.get(key);  
                    // 得到property对应的setter方法  
                    Method setter = property.getWriteMethod();
                    setter.invoke(obj, value);  
                }  
  
            }  
  
        } catch (Exception e) {  
            System.out.println("transMap2Bean Error " + e);  
        }  
  
        return;  
  
    } 
}
