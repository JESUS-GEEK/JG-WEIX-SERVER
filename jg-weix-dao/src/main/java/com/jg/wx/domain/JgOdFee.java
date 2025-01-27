package com.jg.wx.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SHIJP
 */
public class JgOdFee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.cat_style
     *
     * @mbg.generated
     */
    private String catStyle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.cat_type
     *
     * @mbg.generated
     */
    private Integer catType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.cat_name
     *
     * @mbg.generated
     */
    private String catName;
    private Integer peopleNum;
    private String dayFee;
    private String monthFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.fee_weight
     *
     * @mbg.generated
     */
    private Double feeWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jg_hy_od_fee.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;


    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getDayFee() {
        return dayFee;
    }

    public void setDayFee(String dayFee) {
        this.dayFee = dayFee;
    }

    public String getMonthFee() {
        return monthFee;
    }

    public void setMonthFee(String monthFee) {
        this.monthFee = monthFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.id
     *
     * @return the value of jg_hy_od_fee.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.id
     *
     * @param id the value for jg_hy_od_fee.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.cat_style
     *
     * @return the value of jg_hy_od_fee.cat_style
     * @mbg.generated
     */
    public String getCatStyle() {
        return catStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.cat_style
     *
     * @param catStyle the value for jg_hy_od_fee.cat_style
     * @mbg.generated
     */
    public void setCatStyle(String catStyle) {
        this.catStyle = catStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.cat_type
     *
     * @return the value of jg_hy_od_fee.cat_type
     * @mbg.generated
     */
    public Integer getCatType() {
        return catType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.cat_type
     *
     * @param catType the value for jg_hy_od_fee.cat_type
     * @mbg.generated
     */
    public void setCatType(Integer catType) {
        this.catType = catType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.cat_name
     *
     * @return the value of jg_hy_od_fee.cat_name
     * @mbg.generated
     */
    public String getCatName() {
        return catName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.cat_name
     *
     * @param catName the value for jg_hy_od_fee.cat_name
     * @mbg.generated
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.fee_weight
     *
     * @return the value of jg_hy_od_fee.fee_weight
     * @mbg.generated
     */
    public Double getFeeWeight() {
        return feeWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.fee_weight
     *
     * @param feeWeight the value for jg_hy_od_fee.fee_weight
     * @mbg.generated
     */
    public void setFeeWeight(Double feeWeight) {
        this.feeWeight = feeWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.create_time
     *
     * @return the value of jg_hy_od_fee.create_time
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.create_time
     *
     * @param createTime the value for jg_hy_od_fee.create_time
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jg_hy_od_fee.update_time
     *
     * @return the value of jg_hy_od_fee.update_time
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jg_hy_od_fee.update_time
     *
     * @param updateTime the value for jg_hy_od_fee.update_time
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
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
        sb.append(", catStyle=").append(catStyle);
        sb.append(", catType=").append(catType);
        sb.append(", catName=").append(catName);
        sb.append(", feeWeight=").append(feeWeight);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
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
        JgOdFee other = (JgOdFee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCatStyle() == null ? other.getCatStyle() == null : this.getCatStyle().equals(other.getCatStyle()))
                && (this.getCatType() == null ? other.getCatType() == null : this.getCatType().equals(other.getCatType()))
                && (this.getCatName() == null ? other.getCatName() == null : this.getCatName().equals(other.getCatName()))
                && (this.getFeeWeight() == null ? other.getFeeWeight() == null : this.getFeeWeight().equals(other.getFeeWeight()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCatStyle() == null) ? 0 : getCatStyle().hashCode());
        result = prime * result + ((getCatType() == null) ? 0 : getCatType().hashCode());
        result = prime * result + ((getCatName() == null) ? 0 : getCatName().hashCode());
        result = prime * result + ((getFeeWeight() == null) ? 0 : getFeeWeight().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table jg_hy_od_fee
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        catStyle("cat_style", "catStyle", "VARCHAR", false),
        catType("cat_type", "catType", "INTEGER", false),
        catName("cat_name", "catName", "VARCHAR", false),
        feeWeight("fee_weight", "feeWeight", "DOUBLE", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
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
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table jg_hy_od_fee
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            }
            else {
                return this.column;
            }
        }
    }
}