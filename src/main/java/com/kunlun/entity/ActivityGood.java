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

    private Long activityGoodId;

    private int actgStock;

    /**
     * 修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
                "activityGoodId=" + activityGoodId +
                ", actgStock=" + actgStock +
                ", updateDate=" + updateDate +
                "} " + super.toString();
    }
}
