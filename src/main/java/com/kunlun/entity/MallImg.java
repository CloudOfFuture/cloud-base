package com.kunlun.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-26上午11:04
 * @desc
 */
public class MallImg {


    /**
     * 主键
     */
    private Long id;

    /**
     * 目标id
     */
    private Long targetId;


    /**
     * 图片主图地址
     */
    private String url;

    /**
     * 图片类型
     * 商品图片 0,
     * 品牌图片 1,
     * 文章图片 2,
     * 商品评价图片 3,
     * 广告图片 4,
     * 活动图片 5,
     * 富文本图片路径 6,
     * 证件照图片路径 7
     */
    private String type;


    /**
     * 修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;


    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    public MallImg() {
    }

    public MallImg(String url, String type) {
        this.url = url;
        this.type = type;
    }

    public MallImg(Long targetId, String url, String type) {
        this.targetId = targetId;
        this.url = url;
        this.type = type;
    }

    public MallImg(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
