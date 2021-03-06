package com.kunlun.entity;


/**
 * @author by fk
 * @created on 2017/12/14.
 */
public class OrderExt extends Order {

    /**
     * 页码
     */
    private Integer pageNo;
    /**
     * 数量
     */
    private Integer pageSize;

    /**
     * IP地址
     */
    private String ipAddress;

    /**
     * 微信用户标识code
     */
    private String openCode;

    /**
     * 发货信息
     */
    private Logistics logistics;

    /**
     * 收件人信息
     */
    private Delivery delivery;

    /**
     * 商品图片
     */
    private String goodMainImage;

    /**
     * 快递公司名称
     */
    private String expressName;

    /**
     * 微信code
     */
    private String wxCode;

    /**
     * 商品编号
     */
    private String goodNo;


    /**
     * 活动商品id
     */
    private Long activityGoodId;

    /**
     * 模糊查询信息
     */
    private String searchKey;

    /**
     * 开始时间
     */
    private String startDate;

    /**
     * 结束时间
     */
    private String endDate;

    /**
     * 发货信息
     */
    private SendGood sendGood;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOpenCode() {
        return openCode;
    }

    public void setOpenCode(String openCode) {
        this.openCode = openCode;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String getGoodMainImage() {
        return goodMainImage;
    }

    public void setGoodMainImage(String goodMainImage) {
        this.goodMainImage = goodMainImage;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo;
    }

    public Long getActivityGoodId() {
        return activityGoodId;
    }

    public void setActivityGoodId(Long activityGoodId) {
        this.activityGoodId = activityGoodId;
    }


    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Logistics getLogistics() {
        return logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public SendGood getSendGood() {
        return sendGood;
    }

    public void setSendGood(SendGood sendGood) {
        this.sendGood = sendGood;
    }

    @Override
    public String toString() {
        return "OrderExt{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", ipAddress='" + ipAddress + '\'' +
                ", openCode='" + openCode + '\'' +
                ", logistics=" + logistics +
                ", delivery=" + delivery +
                ", goodMainImage='" + goodMainImage + '\'' +
                ", expressName='" + expressName + '\'' +
                ", wxCode='" + wxCode + '\'' +
                ", goodNo='" + goodNo + '\'' +
                ", activityGoodId=" + activityGoodId +
                ", searchKey='" + searchKey + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", sendGood=" + sendGood +
                '}';
    }
}
