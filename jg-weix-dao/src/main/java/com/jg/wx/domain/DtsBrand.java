package com.jg.wx.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class DtsBrand {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dts_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dts_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean IS_DELETED = true;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.pic_url
     *
     * @mbg.generated
     */
    private String picUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.sort_order
     *
     * @mbg.generated
     */
    private Byte sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.floor_price
     *
     * @mbg.generated
     */
    private BigDecimal floorPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.add_time
     *
     * @mbg.generated
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.share_url
     *
     * @mbg.generated
     */
    private String shareUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.commpany
     *
     * @mbg.generated
     */
    private String commpany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.auto_update_good
     *
     * @mbg.generated
     */
    private Boolean autoUpdateGood;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.shop_url
     *
     * @mbg.generated
     */
    private String shopUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.default_category_id
     *
     * @mbg.generated
     */
    private Integer defaultCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.default_pages
     *
     * @mbg.generated
     */
    private Integer defaultPages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dts_brand.add_precent
     *
     * @mbg.generated
     */
    private Integer addPrecent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.id
     *
     * @return the value of dts_brand.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.id
     *
     * @param id the value for dts_brand.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.name
     *
     * @return the value of dts_brand.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.name
     *
     * @param name the value for dts_brand.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.desc
     *
     * @return the value of dts_brand.desc
     *
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.desc
     *
     * @param desc the value for dts_brand.desc
     *
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.pic_url
     *
     * @return the value of dts_brand.pic_url
     *
     * @mbg.generated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.pic_url
     *
     * @param picUrl the value for dts_brand.pic_url
     *
     * @mbg.generated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.sort_order
     *
     * @return the value of dts_brand.sort_order
     *
     * @mbg.generated
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.sort_order
     *
     * @param sortOrder the value for dts_brand.sort_order
     *
     * @mbg.generated
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.floor_price
     *
     * @return the value of dts_brand.floor_price
     *
     * @mbg.generated
     */
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.floor_price
     *
     * @param floorPrice the value for dts_brand.floor_price
     *
     * @mbg.generated
     */
    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.add_time
     *
     * @return the value of dts_brand.add_time
     *
     * @mbg.generated
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.add_time
     *
     * @param addTime the value for dts_brand.add_time
     *
     * @mbg.generated
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.update_time
     *
     * @return the value of dts_brand.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.update_time
     *
     * @param updateTime the value for dts_brand.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.share_url
     *
     * @return the value of dts_brand.share_url
     *
     * @mbg.generated
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.share_url
     *
     * @param shareUrl the value for dts_brand.share_url
     *
     * @mbg.generated
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.deleted
     *
     * @return the value of dts_brand.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.deleted
     *
     * @param deleted the value for dts_brand.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.commpany
     *
     * @return the value of dts_brand.commpany
     *
     * @mbg.generated
     */
    public String getCommpany() {
        return commpany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.commpany
     *
     * @param commpany the value for dts_brand.commpany
     *
     * @mbg.generated
     */
    public void setCommpany(String commpany) {
        this.commpany = commpany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.auto_update_good
     *
     * @return the value of dts_brand.auto_update_good
     *
     * @mbg.generated
     */
    public Boolean getAutoUpdateGood() {
        return autoUpdateGood;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.auto_update_good
     *
     * @param autoUpdateGood the value for dts_brand.auto_update_good
     *
     * @mbg.generated
     */
    public void setAutoUpdateGood(Boolean autoUpdateGood) {
        this.autoUpdateGood = autoUpdateGood;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.shop_url
     *
     * @return the value of dts_brand.shop_url
     *
     * @mbg.generated
     */
    public String getShopUrl() {
        return shopUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.shop_url
     *
     * @param shopUrl the value for dts_brand.shop_url
     *
     * @mbg.generated
     */
    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.default_category_id
     *
     * @return the value of dts_brand.default_category_id
     *
     * @mbg.generated
     */
    public Integer getDefaultCategoryId() {
        return defaultCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.default_category_id
     *
     * @param defaultCategoryId the value for dts_brand.default_category_id
     *
     * @mbg.generated
     */
    public void setDefaultCategoryId(Integer defaultCategoryId) {
        this.defaultCategoryId = defaultCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.default_pages
     *
     * @return the value of dts_brand.default_pages
     *
     * @mbg.generated
     */
    public Integer getDefaultPages() {
        return defaultPages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.default_pages
     *
     * @param defaultPages the value for dts_brand.default_pages
     *
     * @mbg.generated
     */
    public void setDefaultPages(Integer defaultPages) {
        this.defaultPages = defaultPages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dts_brand.add_precent
     *
     * @return the value of dts_brand.add_precent
     *
     * @mbg.generated
     */
    public Integer getAddPrecent() {
        return addPrecent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dts_brand.add_precent
     *
     * @param addPrecent the value for dts_brand.add_precent
     *
     * @mbg.generated
     */
    public void setAddPrecent(Integer addPrecent) {
        this.addPrecent = addPrecent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_brand
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", desc=").append(desc);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", sortOrder=").append(sortOrder);
        sb.append(", floorPrice=").append(floorPrice);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", shareUrl=").append(shareUrl);
        sb.append(", deleted=").append(deleted);
        sb.append(", commpany=").append(commpany);
        sb.append(", autoUpdateGood=").append(autoUpdateGood);
        sb.append(", shopUrl=").append(shopUrl);
        sb.append(", defaultCategoryId=").append(defaultCategoryId);
        sb.append(", defaultPages=").append(defaultPages);
        sb.append(", addPrecent=").append(addPrecent);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_brand
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DtsBrand other = (DtsBrand) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getSortOrder() == null ? other.getSortOrder() == null : this.getSortOrder().equals(other.getSortOrder()))
            && (this.getFloorPrice() == null ? other.getFloorPrice() == null : this.getFloorPrice().equals(other.getFloorPrice()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getShareUrl() == null ? other.getShareUrl() == null : this.getShareUrl().equals(other.getShareUrl()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCommpany() == null ? other.getCommpany() == null : this.getCommpany().equals(other.getCommpany()))
            && (this.getAutoUpdateGood() == null ? other.getAutoUpdateGood() == null : this.getAutoUpdateGood().equals(other.getAutoUpdateGood()))
            && (this.getShopUrl() == null ? other.getShopUrl() == null : this.getShopUrl().equals(other.getShopUrl()))
            && (this.getDefaultCategoryId() == null ? other.getDefaultCategoryId() == null : this.getDefaultCategoryId().equals(other.getDefaultCategoryId()))
            && (this.getDefaultPages() == null ? other.getDefaultPages() == null : this.getDefaultPages().equals(other.getDefaultPages()))
            && (this.getAddPrecent() == null ? other.getAddPrecent() == null : this.getAddPrecent().equals(other.getAddPrecent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_brand
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        result = prime * result + ((getFloorPrice() == null) ? 0 : getFloorPrice().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getShareUrl() == null) ? 0 : getShareUrl().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCommpany() == null) ? 0 : getCommpany().hashCode());
        result = prime * result + ((getAutoUpdateGood() == null) ? 0 : getAutoUpdateGood().hashCode());
        result = prime * result + ((getShopUrl() == null) ? 0 : getShopUrl().hashCode());
        result = prime * result + ((getDefaultCategoryId() == null) ? 0 : getDefaultCategoryId().hashCode());
        result = prime * result + ((getDefaultPages() == null) ? 0 : getDefaultPages().hashCode());
        result = prime * result + ((getAddPrecent() == null) ? 0 : getAddPrecent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table dts_brand
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        name("name", "name", "VARCHAR", true),
        desc("desc", "desc", "VARCHAR", true),
        picUrl("pic_url", "picUrl", "VARCHAR", false),
        sortOrder("sort_order", "sortOrder", "TINYINT", false),
        floorPrice("floor_price", "floorPrice", "DECIMAL", false),
        addTime("add_time", "addTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        shareUrl("share_url", "shareUrl", "VARCHAR", false),
        deleted("deleted", "deleted", "BIT", false),
        commpany("commpany", "commpany", "VARCHAR", false),
        autoUpdateGood("auto_update_good", "autoUpdateGood", "BIT", false),
        shopUrl("shop_url", "shopUrl", "VARCHAR", false),
        defaultCategoryId("default_category_id", "defaultCategoryId", "INTEGER", false),
        defaultPages("default_pages", "defaultPages", "INTEGER", false),
        addPrecent("add_precent", "addPrecent", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table dts_brand
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}