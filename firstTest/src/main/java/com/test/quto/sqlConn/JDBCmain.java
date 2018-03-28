package com.test.quto.sqlConn;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement; 

public class JDBCmain {
	 static Connection conn;  
	    static Statement st;  
	    private static String driver = "com.mysql.jdbc.Driver";  
	    private static String url = "jdbc:mysql://127.0.0.1:3306/test_01_xampp";  
	    private static String usr = "root";  
	      
	    //password for mysql   
	    private static String psw = "Ctx3azAvHKDVmSrM";   
	    public static void main(String[] args) throws SQLException {  
	          
	        insert();  
	        update();  
	        delete();  
	        query();
	  
	    }  
	    public static void insert() throws SQLException  
	    {  
	        conn = getcon();  
	          
	        String sql = "INSERT INTO staff(name, age, sex, address, depart, worklen, wage)" +  
	                " VALUES ('Tom1', 32, 'male', 'beijingchina', 'personnel', '3', '3000')";  
	        st = conn.createStatement();  
	          
	        //执行插入操作的sql语句，并返回插入数据的个数  
	        int cnt = st.executeUpdate(sql);  
	          
	        //输出插入操作的处理结果  
	        System.out.println("向staff表中插入 " + cnt + " 条数据");  
	        conn.close();   //关闭数据库连接   
	          
	          
	    }  
	    public static void update() throws SQLException  
	    {  
	          
	        conn = getcon();  
	          
	        String sql = "update staff set wage = '2200' where name = 'Tom1'";  
	          
	        try {  
	            st = conn.createStatement();  
	        } catch (SQLException e) {  
	              
	            e.printStackTrace();  
	        }  
	        int cnt = st.executeUpdate(sql);  
	        System.out.println("staff表 更新： " + cnt + "条数据");  
	        conn.close();  
	          
	    }  
	      
	    public static void delete() throws SQLException  
	    {  
	        conn = getcon();  
	          
	        String sql = "delete from staff  where name = 'Tom1'";  
	        st = conn.createStatement();  
	        int cnt = st.executeUpdate(sql);  
	        System.out.println("staff表中删除 " + cnt + " 条数据");   
	        conn.close();  
	    }  
	      
	    public static void query() throws SQLException  
	    {  
	        conn = getcon();  
	          
	        String sql = "select * from staff";  
	        st = conn.createStatement();  
	        ResultSet rt = st.executeQuery(sql);  
	        System.out.println("query results belows: ");  
	        while(rt.next())  
	        {  
	            String name = rt.getString("name");  
	            String sex = rt.getString("sex");  
	            int age = rt.getInt("age");  
	            String address = rt.getString("address");    
	            String depart = rt.getString("depart");    
	            String worklen = rt.getString("worklen");    
	            String wage = rt.getString("wage");    
	            System.out.println(name + " " + age + " " + sex + " " + address    
	                    + " " + depart + " " + worklen + " " + wage);   
	        }  
	        conn.close();  
	    }  
	    public static Connection getcon()  
	    {  
	        try {  
	            Class.forName(driver);  
	        } catch (ClassNotFoundException e1) {  
	            System.out.println("加载驱动失败.");  
	            e1.printStackTrace();  
	        }  
	        System.out.println("MySQL JDBC Driver Registered!");  
	          
	        try {  
	            conn = DriverManager.getConnection(url, usr, psw);  
	        } catch (SQLException e) {  
	          
	            System.out.println("connection failed .");  
	            e.printStackTrace();  
	        }  
	        System.out.println("connected!");  
	        return conn;  
	    }  
	  
}
