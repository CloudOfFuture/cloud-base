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

    /**
     * 订单id
     */
    @JSONField(name = "order_id")
    private Long orderId;

    /**
     * 订单编号
     */
    @JSONField(name = "order_no")
    private Long orderNo;

    /**
     * 微信code
     */
    @JSONField(name = "wx_code")
    private String wxCode;

    /**
     * 当前页
     */
    @JSONField(name = "page_no")
    private int pageNo;

    /**
     * 每页条数
     */
    @JSONField(name = "page_size")
    private int pageSize;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 物流单号
     */
    @JSONField(name = "logistic_no")
    private String logisticNo;

    /**
     * 物流名称
     */
    @JSONField(name = "logistic_name")
    private String logisticName;

    /**
     * 公司编码
     */
    @JSONField(name = "company_code")
    private String companyCode;

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

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getLogisticNo() {
        return logisticNo;
    }

    public void setLogisticNo(String logisticNo) {
        this.logisticNo = logisticNo;
    }

    public String getLogisticName() {
        return logisticName;
    }

    public void setLogisticName(String logisticName) {
        this.logisticName = logisticName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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
                ", logisticNo='" + logisticNo + '\'' +
                ", logisticName='" + logisticName + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", sellerId=" + sellerId +
                '}';
    }
}
