package com.izicap.demotrino.DB;


import com.izicap.demotrino.Model.ShopUserTransaction;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class TrinoConnector {
    private static final TrinoConnector instance;

    static {
        try {
            instance = new TrinoConnector();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static TrinoConnector getInstance() {
        return instance;
    }
    private final Connection conn;

    private TrinoConnector() throws SQLException {
        String user = "test", password = "", url = "jdbc:trino://localhost:8080/deltalake";

        final Properties properties = new Properties();
        properties.setProperty("user", user);
        properties.setProperty("password", password);
        properties.setProperty("SSL", "false");
        conn = DriverManager.getConnection(url, properties);
    }

    public List<ShopUserTransaction> fetchAll() throws SQLException {
        List<ShopUserTransaction> listTransactions = new LinkedList<>();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM deltalake.shop_user_transaction_schema.shopusertransaction");
        while (resultSet.next())
        {
            ShopUserTransaction shopUserTransaction = new ShopUserTransaction();
            shopUserTransaction.setShop_id(resultSet.getLong("shop_id"));
            shopUserTransaction.setUnique_id(resultSet.getString("unique_id"));
            shopUserTransaction.setCard_token(resultSet.getString("card_token"));
            shopUserTransaction.setCustomer_id(resultSet.getString("customer_id"));
            shopUserTransaction.setUser_id(resultSet.getLong("user_id"));
            listTransactions.add(shopUserTransaction);

        }
        return listTransactions;
    }
}
