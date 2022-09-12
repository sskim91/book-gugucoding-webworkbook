package org.zerock.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by sskim on 2022/09/10
 */
public class ConnectTests {

    @Test
    public void test1() {
        int v1 = 10;
        int v2 = 10;

        Assertions.assertEquals(v1, v2);
    }

    @Test
    public void testConnection() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb"
                , "root"
                , "sskim91");

        Assertions.assertNotNull(connection);

        connection.close();

    }

    @Test
    void testHikariCP() throws Exception {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("root");
        config.setPassword("sskim91");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        connection.close();
    }
}
