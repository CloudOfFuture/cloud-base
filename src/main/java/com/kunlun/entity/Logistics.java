package com.kunlun.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 物流信息
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/20.
 */
public class Logistics {

    private Long id;

    @JSONField(name = "order_id")
    private Long orderId;

    @JSONField(name = "sender_id")
    private Long senderId;

    @JSONField(name = "logistic_name")
    private String logisticName;

    @JSONField(name = "express_no")
    private String expressNo;

    @JSONField(name = "logistic_no")
    private String logisticNo;

    @JSONField(name = "company_code")
    private String companyCode;

    @JSONField(name = "create_date",format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    @JSONField(name = "update_date",format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getLogisticName() {
        return logisticName;
    }

    public void setLogisticName(String logisticName) {
        this.logisticName = logisticName;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getLogisticNo() {
        return logisticNo;
    }

    public void setLogisticNo(String logisticNo) {
        this.logisticNo = logisticNo;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Logistics{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", senderId=" + senderId +
                ", logisticName='" + logisticName + '\'' +
                ", expressNo='" + expressNo + '\'' +
                ", logisticNo='" + logisticNo + '\'' +
                ", companyCode='" + companyCode + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
