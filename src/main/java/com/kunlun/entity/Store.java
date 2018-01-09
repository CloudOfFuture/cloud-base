package com.kunlun.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by hmy
 * @version <0.1>
 * @created on 2017-12-25.
 */
public class Store implements Serializable {

    private static final long serialVersionUID = 6856688633509625013L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 商家审核
     * AUDITING       待审核
     * NOT_PASS_AUDIT 审核未通过
     * PASS_AUDIT     审核通过
     */
    private String audit;

    /**
     * 店铺状态
     * NORMAL    正常
     * UN_NORMAL 关闭
     */
    private String status;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 店铺编号
     */
    private String storeNo;

    /**
     * 信誉值(0-99)
     */
    private int reputation;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 店铺地址
     */
    private String storeAddress;

    /**
     * 店铺描述
     */
    private String storeDescription;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createDate;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date updateDate;

    /**
     * 不通过的原因
     */
    private String reason;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public java.lang.String toString() {
        return "Store{" +
                "id=" + id +
                ", audit=" + audit +
                ", status=" + status +
                ", mobile=" + mobile +
                ", userId=" + userId +
                ", sellerNo=" + storeNo +
                ", reputation=" + reputation +
                ", storeName=" + storeName +
                ", storeAddress=" + storeAddress +
                ", storeDescription=" + storeDescription +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", reason=" + reason +
                '}';
    }
}
