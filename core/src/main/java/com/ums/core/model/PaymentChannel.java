package com.ums.core.model;

import java.util.Date;

public class PaymentChannel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.id
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.created_time
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.updated_time
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.version
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.channel_name
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private String channelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.channel_description
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private String channelDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_channel.batch_size
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    private Integer batchSize;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.id
     *
     * @return the value of payment_channel.id
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.id
     *
     * @param id the value for payment_channel.id
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.created_time
     *
     * @return the value of payment_channel.created_time
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.created_time
     *
     * @param createdTime the value for payment_channel.created_time
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.updated_time
     *
     * @return the value of payment_channel.updated_time
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.updated_time
     *
     * @param updatedTime the value for payment_channel.updated_time
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.version
     *
     * @return the value of payment_channel.version
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.version
     *
     * @param version the value for payment_channel.version
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.channel_name
     *
     * @return the value of payment_channel.channel_name
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.channel_name
     *
     * @param channelName the value for payment_channel.channel_name
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.channel_description
     *
     * @return the value of payment_channel.channel_description
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public String getChannelDescription() {
        return channelDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.channel_description
     *
     * @param channelDescription the value for payment_channel.channel_description
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_channel.batch_size
     *
     * @return the value of payment_channel.batch_size
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_channel.batch_size
     *
     * @param batchSize the value for payment_channel.batch_size
     *
     * @mbggenerated Mon May 01 14:45:56 CST 2017
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }
}