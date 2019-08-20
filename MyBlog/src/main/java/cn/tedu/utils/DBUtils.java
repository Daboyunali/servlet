package cn.tedu.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	private static BasicDataSource ds;
	static {

		// 创建属性对象
		Properties p = new Properties();
		// 获取文件流
		InputStream ips = DBUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			// 把流加载到属性对象中
			p.load(ips);
			// 从属性对象中获取数据
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");

			// 创建连接池
			ds = new BasicDataSource();
			// 设置连接信息
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/smartblogs?characterEncoding=UTF-8");
			ds.setUsername("root");
			ds.setPassword("root");
			// 设置初始连接数量
			ds.setInitialSize(3);
			// 设置最大连接数量
			ds.setMaxActive(5);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConn() throws Exception {

		// 从连接池当中获取连接
		return ds.getConnection();
	}
}
