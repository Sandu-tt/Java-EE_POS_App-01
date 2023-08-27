package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.QueryBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.QueryDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class QueryBOImpl implements QueryBO {

    private final QueryDAO queryDAO = (QueryDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOM);

    @Override
    public int getSumOrders(Connection connection) throws SQLException, ClassNotFoundException {
        return queryDAO.getSumOrders(connection);
    }

    @Override
    public int getItem(Connection connection) throws SQLException, ClassNotFoundException {
        return queryDAO.getItem(connection);
    }

    @Override
    public int getCustomer(Connection connection) throws SQLException, ClassNotFoundException {
        return queryDAO.getCustomer(connection);
    }
}
