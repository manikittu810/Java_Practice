package com.jdbc.dbUtil;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
public class DBUtil {
        private static HikariDataSource hikariDataSource;

        static {
            try (InputStream inputStream = DBUtil.class.getClassLoader().getResourceAsStream("db.properties")) {
                Properties props = new Properties();
                props.load(inputStream);

                HikariConfig config = new HikariConfig();
                config.setJdbcUrl(props.getProperty("db.url"));
                config.setUsername(props.getProperty("db.username"));
                config.setPassword(props.getProperty("db.password"));
                config.setMaximumPoolSize(Integer.parseInt(props.getProperty("db.pollSize","10")));
                config.setConnectionTimeout(Long.parseLong(props.getProperty("db.timeout","5000"))*1000);

              hikariDataSource = new HikariDataSource(config);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static Connection getConnection() throws Exception {
            return hikariDataSource.getConnection();
        }
        public static void close(){
            if(hikariDataSource!=null){
                hikariDataSource.close();
            }
        }
}
