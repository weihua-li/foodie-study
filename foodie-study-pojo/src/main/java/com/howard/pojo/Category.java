package com.howard.pojo;

import javax.persistence.*;

public class Category {
    /**
     * 商品分类id
     */
    @Id
    private String id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类类型
     */
    private Integer type;

    /**
     * 父id
     */
    @Column(name = "father_id")
    private Integer fatherId;

    /**
     * 图标
     */
    private String logo;

    /**
     * 口号
     */
    private String slogan;

    /**
     * 分类图
     */
    @Column(name = "cat_image")
    private String catImage;

    /**
     * 背景颜色
     */
    @Column(name = "bg_color")
    private String bgColor;

    /**
     * 获取商品分类id
     *
     * @return id - 商品分类id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置商品分类id
     *
     * @param id 商品分类id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类类型
     *
     * @return type - 分类类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置分类类型
     *
     * @param type 分类类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取父id
     *
     * @return father_id - 父id
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * 设置父id
     *
     * @param fatherId 父id
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 获取图标
     *
     * @return logo - 图标
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图标
     *
     * @param logo 图标
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取口号
     *
     * @return slogan - 口号
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * 设置口号
     *
     * @param slogan 口号
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * 获取分类图
     *
     * @return cat_image - 分类图
     */
    public String getCatImage() {
        return catImage;
    }

    /**
     * 设置分类图
     *
     * @param catImage 分类图
     */
    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    /**
     * 获取背景颜色
     *
     * @return bg_color - 背景颜色
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * 设置背景颜色
     *
     * @param bgColor 背景颜色
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}