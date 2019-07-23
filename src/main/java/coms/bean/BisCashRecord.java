package coms.bean;

import java.util.Date;

public class BisCashRecord {
    private String recordId;

    private String orderId;

    private String customUserId;

    private Integer beautyNum;

    private Double money;

    private String payWay;

    private String cashType;

    private String recordType;

    private Date payTime;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    public Integer getBeautyNum() {
        return beautyNum;
    }

    public void setBeautyNum(Integer beautyNum) {
        this.beautyNum = beautyNum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType == null ? null : cashType.trim();
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return "BisCashRecord{" +
                "recordId='" + recordId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", customUserId='" + customUserId + '\'' +
                ", beautyNum=" + beautyNum +
                ", money=" + money +
                ", payWay='" + payWay + '\'' +
                ", cashType='" + cashType + '\'' +
                ", recordType='" + recordType + '\'' +
                ", payTime=" + payTime +
                '}';
    }
}