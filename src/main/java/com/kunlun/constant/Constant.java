package com.kunlun.constant;

/**
 * @author JackSpeed
 * @version V1.0 <>
 * @date 17-12-25下午5:48
 * @desc
 */
public class Constant {
    /**
     * 手机号码长度
     */
    public static final int MOBILE_LENGTH = 11;

    /**
     * 密码最小长度限制
     */
    public static final int PASSWORD_MIN_LENGTH = 6;

    /**
     * 邮箱判断正则表达式
     */
    public static final String REGEX = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
    /**
     * 图片路径
     */
    public static final String BASE_IMG_DIR = "/home/hcon/downloads";
    /**
     * 商品图片路径 0
     */
    public static final String GOODS_IMG_PATH = BASE_IMG_DIR + "/mall/goodimage/";

    /**
     * 品牌图片路径 1
     */
    public static final String BRAND_IMG_PATH = BASE_IMG_DIR + "/mall/brandimage/";

    /**
     * 文章图片路径 2
     */
    public static final String ARTICLE_IMG_PATH = BASE_IMG_DIR + "/mall/articleimage/";

    /**
     * 商品评价图片路径 3
     */
    public static final String GOODS_ESTIMATE_IMG_PATH = GOODS_IMG_PATH + "estimateimage/";

    /**
     * 广告图片路径 4
     */
    public static final String BANNER_IMG_PATH = BASE_IMG_DIR + "/mall/bannerimage/";

    /**
     * 活动图片路径 5
     */
    public static final String ACTIVITY_IMG_PATH = BASE_IMG_DIR + "/mall/activityimage/";


    /**
     * 富文本图片路径 6
     */
    public static final String RICH_TEXT_IMG_PATH = GOODS_IMG_PATH + "richtext/";

    /**
     * 证件照图片路径  7
     */
    public static final String ID_CARD_IMG_PATH = BASE_IMG_DIR + "/mall/idcardimage/";

    /**
     * 其他模块图片路径
     */
    public static final String OTHER_IMG_PATH = BASE_IMG_DIR + "/mall/otherimage/";

    /**
     * 水印图片地址 绝对路径
     */
    public static final String WATER_REMARK_IMAGE_PATH = BASE_IMG_DIR + "/mall/mall-waterremark.png";


    /**
     * 图片尺寸集合
     */
    public static final String[] SIZE_ARR = {"30x30", "40x40", "60x60", "220x220", "400x400"};

    /**
     * 添加水印的图片尺寸不能小于这个值
     */
    public static final int WATER_REMARK_SIZE = 220;


}
