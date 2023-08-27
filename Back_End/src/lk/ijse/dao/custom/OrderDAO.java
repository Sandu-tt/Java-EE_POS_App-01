package lk.ijse.dao.custom;

import lk.ijse.dao.CrudDAO;
import lk.ijse.entity.Orders;

import java.sql.Connection;
import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<Orders, String> {
    boolean mangeItems(int qty, String code, Connection connection) throws SQLException, ClassNotFoundException;

}
