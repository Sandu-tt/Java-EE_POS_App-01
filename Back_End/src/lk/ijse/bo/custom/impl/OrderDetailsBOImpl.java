package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.OrderDetailsBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.OrderDetailsDAO;
import lk.ijse.dto.OrderDetailDTO;
import lk.ijse.entity.OrderDetail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class OrderDetailsBOImpl implements OrderDetailsBO {
    private final OrderDetailsDAO orderDetailsDAO = (OrderDetailsDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ORDERDETAILS);

    @Override
    public ArrayList<OrderDetailDTO> getAllOrderDetails(Connection connection) throws SQLException, ClassNotFoundException {
        ArrayList<OrderDetail> all = orderDetailsDAO.getAll(connection);

        ArrayList<OrderDetailDTO> allOrderDetails = new ArrayList<>();
        for (OrderDetail orderDetail : all) {
            allOrderDetails.add(new OrderDetailDTO(orderDetail.getOrderId(), orderDetail.getItemCode(), orderDetail.getQty(), orderDetail.getTotal()));
        }
        return allOrderDetails;
    }

    @Override
    public boolean purchaseOrderDetails(OrderDetailDTO dto, Connection connection) throws SQLException, ClassNotFoundException {
        return orderDetailsDAO.save(new OrderDetail(dto.getOrderId(), dto.getItemCode(), dto.getQty(), dto.getTotal()), connection);
    }

}
