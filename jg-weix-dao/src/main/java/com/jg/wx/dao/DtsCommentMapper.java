package com.jg.wx.dao;

import com.jg.wx.domain.DtsComment;
import com.jg.wx.domain.DtsCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DtsCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    long countByExample(DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int deleteByExample(DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int insert(DtsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int insertSelective(DtsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsComment selectOneByExample(DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsComment selectOneByExampleSelective(@Param("example") DtsCommentExample example, @Param("selective") DtsComment.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsComment> selectByExampleSelective(@Param("example") DtsCommentExample example, @Param("selective") DtsComment.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    List<DtsComment> selectByExample(DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsComment.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    DtsComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsComment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsComment record, @Param("example") DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsComment record, @Param("example") DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DtsCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}