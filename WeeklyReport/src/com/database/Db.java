package com.database;
import java.sql.*;
public class Db {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/chhenjn?useUnicode=true&characterEncoding=UTF-8";
	private static final String username = "root";
	private static final String password = "123456";
	public static Connection conn = null;

	// 静态代码块负责加载驱动

	static {
		try {
			Class.forName(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * 单例模式返回数据库连接对象
	 */
	//连接数据库
	public static Connection getConnection() throws Exception {
		if (conn == null) {
			conn = DriverManager.getConnection(url, username, password);
			return conn;
		}
		return conn;
	}
	//选择
	public ResultSet select(String sql) throws Exception {  
        Connection conn = null;  
        Statement stmt = null;  
        ResultSet rs = null;  
        try {  
            conn = getConnection();  
            stmt = conn.createStatement();  
            rs = ((java.sql.Statement) stmt).executeQuery(sql);  
            return rs;  
        } catch (SQLException sqle) {  
            throw new SQLException("select data exception: "  
                    + sqle.getMessage());  
        } catch (Exception e) {  
            throw new Exception("System e exception: " + e.getMessage());  
        }  
  
    }
	
	// 增加记录
		public void insert(String sql) throws Exception {  
	        Connection conn = null;  
	        PreparedStatement ps = null;  
	        try {  
	            conn = getConnection();  
	            ps = (PreparedStatement) conn.prepareStatement(sql);  
	            ps.executeUpdate();  
	        } catch (SQLException sqle) {  
	            throw new Exception("insert data exception: " + sqle.getMessage());  
	        } finally {  
	            try {  
	                if (ps != null) {  
	                    ps.close();  
	                }  
	            } catch (Exception e) {  
	                throw new Exception("ps close exception: " + e.getMessage());  
	            }  
	        }  
	        try {  
	            if (conn != null) {  
	                conn.close();  
	            }  
	        } catch (Exception e) {  
	            throw new Exception("connection close exception: " + e.getMessage());  
	        }  
	    }  
		
		// 更新
		public void update(String sql) throws Exception {  
		        Connection conn = null;  
		        PreparedStatement ps = null;  
		        try {  
		            conn = getConnection();  
		            ps = (PreparedStatement) conn.prepareStatement(sql);  
		            ps.executeUpdate();  
		        } catch (SQLException sqle) {  
		            throw new Exception("update exception: " + sqle.getMessage());  
		        } finally {  
		            try {  
		                if (ps != null) {  
		                    ps.close();  
		                }  
		            } catch (Exception e) {  
		                throw new Exception("ps close exception: " + e.getMessage());  
		            }  
		        }  
		        try {  
		            if (conn != null) {  
		                conn.close();  
		            }  
		        } catch (Exception e) {  
		            throw new Exception("connection close exception: " + e.getMessage());  
		        }  
		    }  
		 
		//删除
		 public void delete(String sql) throws Exception {  
		        Connection conn = null;  
		        PreparedStatement ps = null;  
		        try {  
		            conn = getConnection();  
		            ps = (PreparedStatement) conn.prepareStatement(sql);  
		            ps.executeUpdate();  
		        } catch (SQLException sqle) {  
		            throw new Exception("delete data exception: " + sqle.getMessage());  
		        } finally {  
		            try {  
		                if (ps != null) {  
		                    ps.close();  
		                }  
		            } catch (Exception e) {  
		                throw new Exception("ps close exception: " + e.getMessage());  
		            }  
		        }  
		        try {  
		            if (conn != null) {  
		                conn.close();  
		            }  
		        } catch (Exception e) {  
		            throw new Exception("connection close exception: " + e.getMessage());  
		        }  
		    }  

	
}
