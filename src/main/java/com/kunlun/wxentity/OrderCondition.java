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

    @Override
    public String toString() {
        return "OrderCondition{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                '}';
    }
}
