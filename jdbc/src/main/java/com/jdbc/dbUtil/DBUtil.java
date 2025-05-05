package com.jdbc.dbUtil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DBUtil {
        private static String url;
        private static String username;
        private static String password;

        static {
            try (InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("db.properties")) {
                Properties props = new Properties();
                props.load(inputStream);

                url = props.getProperty("db.url");
                username = props.getProperty("db.username");
                password = props.getProperty("db.password");

                int timeout = Integer.parseInt(props.getProperty("db.timeout", "5"));
                DriverManager.setLoginTimeout(timeout);

                // Load MySQL Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Error initializing DBUtil", e);
            }
        }

        public static Connection getConnection() throws Exception {
            return DriverManager.getConnection(url, username, password);
        }
}
