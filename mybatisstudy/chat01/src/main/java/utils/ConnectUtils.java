package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <p>
 *
 * <p>
 *
 * @author wudingjia
 * @date 2020-11-11 19:24
 */
public class ConnectUtils {
	private static final String url = "jdbc:mysql://47.97.215.99:3306/study?useSSL=false"; //数据库地址
	private static final String username = "root"; //数据库⽤户名
	private static final String password = "wuqwe123"; //数据库密码
	private static final String driver = "com.mysql.jdbc.Driver";//mysql驱动
	/**
	 * 连接数据库
	 *
	 * @return
	 */
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(driver); //加载数据库驱动
			try {
				conn = DriverManager.getConnection(url, username,
						password); //连接数据库
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 关闭数据库链接
	 *
	 * @return
	 */
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close(); //关闭数据库链接
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
