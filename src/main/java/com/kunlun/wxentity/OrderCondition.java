package com.kunlun.wxentity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 订单查询条件封装
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

    @Override
    public String toString() {
        return "OrderCondition{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", wxCode='" + wxCode + '\'' +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", status='" + status + '\'' +
                '}';
    }
}
