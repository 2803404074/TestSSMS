package com.springmvc.pojo;

import java.util.Date;

public class SlDataTrad {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Sl_data_trad.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Sl_data_trad.createdAt
     *
     * @mbggenerated
     */
    private Date createdat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Sl_data_trad.updatedAt
     *
     * @mbggenerated
     */
    private Date updatedat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Sl_data_trad.id
     *
     * @return the value of Sl_data_trad.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Sl_data_trad.id
     *
     * @param id the value for Sl_data_trad.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Sl_data_trad.createdAt
     *
     * @return the value of Sl_data_trad.createdAt
     *
     * @mbggenerated
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Sl_data_trad.createdAt
     *
     * @param createdat the value for Sl_data_trad.createdAt
     *
     * @mbggenerated
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Sl_data_trad.updatedAt
     *
     * @return the value of Sl_data_trad.updatedAt
     *
     * @mbggenerated
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Sl_data_trad.updatedAt
     *
     * @param updatedat the value for Sl_data_trad.updatedAt
     *
     * @mbggenerated
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }
}