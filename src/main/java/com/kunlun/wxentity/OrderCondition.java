package com.kunlun.wxentity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 订单查询条件封装
 *
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/20.
 */
public class OrderCondition {

    @JSONField(name = "order_id")
    private Long orderId;

    @JSONField(name = "order_no")
    private Long orderNo;

    @JSONField(name = "wx_code")
    private String wxCode;

    @JSONField(name = "page_no")
    private int pageNo;

    @JSONField(name = "page_size")
    private int pageSize;

    private String status;

    @JSONField(name = "delivery_no")
    private String deliveryNo;

    @JSONField(name = "express_name")
    private String expressName;

    @JSONField(name = "express_no")
    private String expressNo;

    @JSONField(name = "seller_id")
    private Long sellerId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return "OrderCondition{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", wxCode='" + wxCode + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", status='" + status + '\'' +
                ", deliveryNo='" + deliveryNo + '\'' +
                ", expressName='" + expressName + '\'' +
                ", expressNo='" + expressNo + '\'' +
                ", sellerId=" + sellerId +
                '}';
    }
}
