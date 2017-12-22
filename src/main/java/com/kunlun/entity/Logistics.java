package com.kunlun.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 物流信息
 *
 * @author by kunlun
 * @version <0.1>
 * @created on 2017/12/20.
 */
public class Logistics {

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 寄件人id
     */
    private Long senderId;

    /**
     * 物流名称
     */
    private String logisticName;

    /**
     * 快递编号
     */
    private String expressNo;

    /**
     * 物流单号
     */
    private String logisticNo;

    /**
     * 公司编号
     */
    private String companyCode;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
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
