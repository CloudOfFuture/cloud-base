package com.kunlun.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-21下午1:06
 * @desc
 */
public class GoodExt extends Good {
    /**
     * 活动Id
     */
    private Long activityId;

    /**
     * 活动开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date startDate;

    /**
     * 活动结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date endDate;

    /**
     * 活动类型
     * 0秒杀
     * 1拼团
     * 2优选
     */
    private String activityType;

    /**
     * 活动状态 状态 0正常 1删除
     */
    private String activityStatus;

    private int activityStock;

    /**
     * 目标
     * 0 小程序
     * 1 app
     * 2 网站
     */
    private String target;

    /**
     * 商品Id
     */
    private Long goodId;


    /**
     * 商户名称
     */
    private Long sellerName;


    /**
     * 图片地址暂定最多4-5张
     */
    private List<MallImg> imgList;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public int getActivityStock() {
        return activityStock;
    }

    public void setActivityStock(int activityStock) {
        this.activityStock = activityStock;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getSellerName() {
        return sellerName;
    }

    public void setSellerName(Long sellerName) {
        this.sellerName = sellerName;
    }

    public List<MallImg> getImgList() {
        return imgList;
    }

    public void setImgList(List<MallImg> imgList) {
        this.imgList = imgList;
    }
}
