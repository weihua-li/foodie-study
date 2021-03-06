package com.howard.pojo;

import javax.persistence.*;

@Table(name = "items_param")
public class ItemsParam {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 商品外键id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 产地
     */
    @Column(name = "produc_place")
    private String producPlace;

    /**
     * 保质期
     */
    @Column(name = "foot_period")
    private String footPeriod;

    /**
     * 品牌名
     */
    private String brand;

    /**
     * 生产厂名
     */
    @Column(name = "factory_name")
    private String factoryName;

    /**
     * 生产厂址
     */
    @Column(name = "factory_address")
    private String factoryAddress;

    /**
     * 包装方式
     */
    @Column(name = "packaging_method")
    private String packagingMethod;

    /**
     * 规格重量
     */
    private String weight;

    /**
     * 储存方法
     */
    @Column(name = "storage_method")
    private String storageMethod;

    /**
     * 食用方法
     */
    @Column(name = "eat_method")
    private String eatMethod;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private String createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private String updatedTime;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品外键id
     *
     * @return item_id - 商品外键id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品外键id
     *
     * @param itemId 商品外键id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取产地
     *
     * @return produc_place - 产地
     */
    public String getProducPlace() {
        return producPlace;
    }

    /**
     * 设置产地
     *
     * @param producPlace 产地
     */
    public void setProducPlace(String producPlace) {
        this.producPlace = producPlace;
    }

    /**
     * 获取保质期
     *
     * @return foot_period - 保质期
     */
    public String getFootPeriod() {
        return footPeriod;
    }

    /**
     * 设置保质期
     *
     * @param footPeriod 保质期
     */
    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod;
    }

    /**
     * 获取品牌名
     *
     * @return brand - 品牌名
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌名
     *
     * @param brand 品牌名
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取生产厂名
     *
     * @return factory_name - 生产厂名
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * 设置生产厂名
     *
     * @param factoryName 生产厂名
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    /**
     * 获取生产厂址
     *
     * @return factory_address - 生产厂址
     */
    public String getFactoryAddress() {
        return factoryAddress;
    }

    /**
     * 设置生产厂址
     *
     * @param factoryAddress 生产厂址
     */
    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    /**
     * 获取包装方式
     *
     * @return packaging_method - 包装方式
     */
    public String getPackagingMethod() {
        return packagingMethod;
    }

    /**
     * 设置包装方式
     *
     * @param packagingMethod 包装方式
     */
    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    /**
     * 获取规格重量
     *
     * @return weight - 规格重量
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置规格重量
     *
     * @param weight 规格重量
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * 获取储存方法
     *
     * @return storage_method - 储存方法
     */
    public String getStorageMethod() {
        return storageMethod;
    }

    /**
     * 设置储存方法
     *
     * @param storageMethod 储存方法
     */
    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    /**
     * 获取食用方法
     *
     * @return eat_method - 食用方法
     */
    public String getEatMethod() {
        return eatMethod;
    }

    /**
     * 设置食用方法
     *
     * @param eatMethod 食用方法
     */
    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}