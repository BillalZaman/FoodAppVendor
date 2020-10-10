package com.infotech4it.cibovendor.model;

/**
 * Created by Bilal Zaman on 09/10/2020.
 */
public class OrderListModel {
    private String orderNumber;
    private String orderName;
    private String orderDate;

    public OrderListModel(String orderNumber, String orderName, String orderDate) {
        this.orderNumber = orderNumber;
        this.orderName = orderName;
        this.orderDate = orderDate;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
