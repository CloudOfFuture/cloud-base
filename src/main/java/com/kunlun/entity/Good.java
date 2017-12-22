package com.kunlun.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class Good implements Serializable {

    private static final long serialVersionUID = 1842324470647561821L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 类目id
     */
    private Long categoryId;

    /**
     * 商品名称
     */
    private String goodName;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 促销价
     */
    private int promotion;

    /**
     * 价格
     */
    private int price;

    /**
     * 销量
     */
    private int saleVolume;

    /**
     * 折扣
     */
    private int discount;

    /**
     * 库存
     */
    private int stock;

    /**
     * 上下架
     * ON_SALE  上架
     * OFF_SALE 下架
     */
    private String onSale;

    /**
     * 是否热销
     * HOT     热销
     * NOT_HOT 非热销
     */
    private String hot;

    /**
     * 是否新品
     * IS_NEW  新品
     * NOT_NEW 非新品
     */
    private String isNew;

    /**
     * 创建时间
     */
    @JSONField( format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    /**
     * 最后更新时间
     */
    @JSONField( format = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    /**
     * 是否包邮
     * FREIGHT    包邮
     * UN_FREIGHT 不包邮
     */
    private String freight;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 商户id
     */
    private Long sellerId;

    /**
     * 浏览量
     */
    private int visitTotal;

    /**
     * 商品编码
     */
    private String goodNo;

    /**
     * 主图地址
     */
    private String mainImageUrl;

    /**
     * 状态
     * NORMAL    正常
     * UN_NORMAL 非正常
     */
    private String status;

    /**
     * 商品描述富文本
     */
    private String richContent;

    /**
     * 搜索字段
     */
    private String seo;

    /**
     * 审核状态
     * AUDITING       待审核/审核中
     * NOT_PASS_AUDIT 审核未通过
     * PASS_AUDIT     审核通过
     */
    private String audit;

    /**
     * 审核商品不通过的原因
     */
    private String reason;

    /**
     * 运费
     */
    private int freightFee;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSaleVolume() {
        return saleVolume;
    }

    public void setSaleVolume(int saleVolume) {
        this.saleVolume = saleVolume;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public int getVisitTotal() {
        return visitTotal;
    }

    public void setVisitTotal(int visitTotal) {
        this.visitTotal = visitTotal;
    }

    public String getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRichContent() {
        return richContent;
    }

    public void setRichContent(String richContent) {
        this.richContent = richContent;
    }

    public String getSeo() {
        return seo;
    }

    public void setSeo(String seo) {
        this.seo = seo;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getFreightFee() {
        return freightFee;
    }

    public void setFreightFee(int freightFee) {
        this.freightFee = freightFee;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", goodName='" + goodName + '\'' +
                ", description='" + description + '\'' +
                ", promotion=" + promotion +
                ", price=" + price +
                ", saleVolume=" + saleVolume +
                ", discount=" + discount +
                ", stock=" + stock +
                ", onSale='" + onSale + '\'' +
                ", hot='" + hot + '\'' +
                ", isNew='" + isNew + '\'' +
                ", createDate=" + createDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", freight='" + freight + '\'' +
                ", brandId=" + brandId +
                ", sellerId=" + sellerId +
                ", visitTotal=" + visitTotal +
                ", goodNo='" + goodNo + '\'' +
                ", mainImageUrl='" + mainImageUrl + '\'' +
                ", status='" + status + '\'' +
                ", richContent='" + richContent + '\'' +
                ", seo='" + seo + '\'' +
                ", audit='" + audit + '\'' +
                ", reason='" + reason + '\'' +
                ", freightFee=" + freightFee +
                '}';
    }
}
