package com.kunlun.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class ActivityGood extends GoodExt {

    private static final long serialVersionUID = 9220813765242042874L;

    /**
     * 主键
     */
    private Long id;

    private Long activityGoodId;

    /**
     * 活动id
     */
    private Long activityId;

    /**
     * 商品id
     */
    private Long goodId;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 商品库存
     */
    private int stock;

    private int actgStock;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
     */
    private String status;

    /**
     * 修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getActivityGoodId() {
        return activityGoodId;
    }

    public void setActivityGoodId(Long activityGoodId) {
        this.activityGoodId = activityGoodId;
    }

    public int getActgStock() {
        return actgStock;
    }

    public void setActgStock(int actgStock) {
        this.actgStock = actgStock;
    }

    @Override
    public String toString() {
        return "ActivityGood{" +
                "id=" + id +
                ", activityGoodId=" + activityGoodId +
                ", activityId=" + activityId +
                ", goodId=" + goodId +
                ", createDate=" + createDate +
                ", stock=" + stock +
                ", actgStock=" + actgStock +
                ", status='" + status + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
