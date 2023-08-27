package lk.ijse.bo;

import lk.ijse.bo.custom.impl.*;


public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return (SuperBO) new CustomerBOImpl();
            case CUSTOM:
                return (SuperBO) new QueryBOImpl();
            case ITEM:
                return (SuperBO) new ItemBOImpl();
            case ORDERS:
                return (SuperBO) new OrderBOImpl();
            case ORDERDETAILS:
                return (SuperBO) new OrderDetailsBOImpl();
            default:
                return null;
        }
    }

    public enum BOTypes {
        CUSTOMER, CUSTOM, ITEM, ORDERS, ORDERDETAILS
    }

}
