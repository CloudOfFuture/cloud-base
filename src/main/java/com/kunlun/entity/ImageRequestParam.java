package com.kunlun.entity;

import java.util.List;

/**
 * @author ycj
 * @version V1.0 <图片上传参数>
 * @date 2018-01-12 10:54
 */
public class ImageRequestParam {
    private String cut;
    private String watermark;
    private String imageType;
    private List<MallImageSize> cutSize;

    public List<MallImageSize> getCutSize() {
        return cutSize;
    }

    public void setCutSize(List<MallImageSize> cutSize) {
        this.cutSize = cutSize;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public String toString() {
        return "ImageRequestParam{" +
                "cut='" + cut + '\'' +
                ", watermark='" + watermark + '\'' +
                ", imageType='" + imageType + '\'' +
                '}';
    }
}
