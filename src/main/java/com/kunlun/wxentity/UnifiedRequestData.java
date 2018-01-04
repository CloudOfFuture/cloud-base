package com.kunlun.wxentity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/21.
 */
public class UnifiedRequestData {
    /**
     * 商品id
     */
    private Long goodId;

    /**
     * 配送地址id
     */
    private Long deliveryId;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 购买数量
     */
    private int count;

    /**
     * 买家留言
     */
    private String message;
    /**
     * 订单类型 1pc订单  2手机订单
     */
    private String orderType;
    /**
     * 优惠券id
     */
    private Long ticketId;

    /**
     * 1使用  0 不适用
     * 是否使用优惠券
     */
    private String useTicket;

    /**
     * 积分
     */
    private int point;

    /**
     * 商品总额
     */
    private int goodFee;

    /**
     * 实付金额
     */
    private int paymentFee;

    /**
     * 订单金额
     */
    private int orderFee;

    /**
     * 优惠金额
     */
    private int reduceFee;

    /**
     * 运费金额
     */
    private int freightFee;

    private String wxCode;

    private String ipAddress;

    private Long activityId;
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public int getGoodFee() {
        return goodFee;
    }

    public void setGoodFee(int goodFee) {
        this.goodFee = goodFee;
    }

    public int getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(int paymentFee) {
        this.paymentFee = paymentFee;
    }

    public int getReduceFee() {
        return reduceFee;
    }

    public void setReduceFee(int reduceFee) {
        this.reduceFee = reduceFee;
    }

    public int getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(int freightFee) {
        this.freightFee = freightFee;
    }

    public String getUseTicket() {
        return useTicket;
    }

    public void setUseTicket(String useTicket) {
        this.useTicket = useTicket;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    @Override
    public String toString() {
        return "UnifiedRequestData{" +
                "goodId=" + goodId +
                ", deliveryId=" + deliveryId +
                ", sellerName='" + sellerName + '\'' +
                ", count=" + count +
                ", message='" + message + '\'' +
                ", orderType='" + orderType + '\'' +
                ", ticketId=" + ticketId +
                ", useTicket='" + useTicket + '\'' +
                ", point=" + point +
                ", goodFee=" + goodFee +
                ", paymentFee=" + paymentFee +
                ", orderFee=" + orderFee +
                ", reduceFee=" + reduceFee +
                ", freightFee=" + freightFee +
                ", wxCode='" + wxCode + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", activityId=" + activityId +
                '}';
    }
}
