package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBO;
import lk.ijse.dto.ItemDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public interface ItemBO extends SuperBO {
    ArrayList<ItemDTO> getAllItems(Connection connection) throws SQLException, ClassNotFoundException;

    boolean deleteItem(String code, Connection connection) throws SQLException, ClassNotFoundException;

    boolean saveItem(ItemDTO dto, Connection connection) throws SQLException, ClassNotFoundException;

    boolean updateItem(ItemDTO dto, Connection connection) throws SQLException, ClassNotFoundException;

    String generateNewItemCode(Connection connection) throws SQLException, ClassNotFoundException;

    ArrayList<ItemDTO> itemSearchId(String id, Connection connection) throws SQLException, ClassNotFoundException;

}
