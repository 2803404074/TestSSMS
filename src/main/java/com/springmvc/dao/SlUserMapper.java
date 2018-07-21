package com.springmvc.dao;

import com.springmvc.pojo.SlUser;

public interface SlUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sl_User
     *
     * @mbggenerated
     */
    int insert(SlUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sl_User
     *
     * @mbggenerated
     */
    int insertSelective(SlUser record);

    /**
     * 根据id查询
     * @param uId
     * @return
     */
    SlUser findUserById(int uId);

    /**
     * 登陆接口
     * @param uName
     * @param uPassword
     * @return
     */
    boolean login(String uName,String uPassword);
}