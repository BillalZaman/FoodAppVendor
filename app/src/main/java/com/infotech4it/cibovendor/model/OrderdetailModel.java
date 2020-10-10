package com.infotech4it.cibovendor.model;

/**
 * Created by Bilal Zaman on 10/10/2020.
 */
public class OrderdetailModel {
    private String customerName;
    private String orderName;
    private String orderDate;
    private String orderTime;
    private String orderDetail;
    private String orderInstruction;

    public OrderdetailModel(String customerName, String orderName, String orderDate,
                            String orderTime, String orderDetail, String orderInstruction) {
        this.customerName = customerName;
        this.orderName = orderName;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderDetail = orderDetail;
        this.orderInstruction = orderInstruction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOrderInstruction() {
        return orderInstruction;
    }

    public void setOrderInstruction(String orderInstruction) {
        this.orderInstruction = orderInstruction;
    }
}
