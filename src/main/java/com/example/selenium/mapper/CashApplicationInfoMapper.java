package com.example.selenium.mapper;

import com.example.selenium.model.CashApplicationInfo;
import com.example.selenium.model.CashApplicationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashApplicationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int countByExample(CashApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int deleteByExample(CashApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int insert(CashApplicationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int insertSelective(CashApplicationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    List<CashApplicationInfo> selectByExample(CashApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    CashApplicationInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") CashApplicationInfo record, @Param("example") CashApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int updateByExample(@Param("record") CashApplicationInfo record, @Param("example") CashApplicationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int updateByPrimaryKeySelective(CashApplicationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cash_applicant_info
     *
     * @mbggenerated Mon Feb 18 13:05:44 CST 2019
     */
    int updateByPrimaryKey(CashApplicationInfo record);
}