package com.kunlun.entity;


/**
 * @author by fk
 * @version <0.1>
 * @created on 2017/12/13.
 */
public class GoodSnapshot extends Good {

    private static final long serialVersionUID = 7608967064373598333L;

    /**
     * 商品快照编码
     */
    private String goodSnapshotNo;

    /**
     * 商品描述
     */
    private String goodDescription;


    /**
     * 商品id
     */
    private Long goodId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getGoodSnapshotNo() {
        return goodSnapshotNo;
    }

    public void setGoodSnapshotNo(String goodSnapshotNo) {
        this.goodSnapshotNo = goodSnapshotNo;
    }

    public String getGoodDescription() {
        return goodDescription;
    }

    public void setGoodDescription(String goodDescription) {
        this.goodDescription = goodDescription;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    @Override
    public String toString() {
        return "GoodSnapshot{" +
                "goodSnapshotNo='" + goodSnapshotNo + '\'' +
                ", goodDescription='" + goodDescription + '\'' +
                ", goodId=" + goodId +
                "} " + super.toString();
    }
}
