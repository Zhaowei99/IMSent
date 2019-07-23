package coms.bean;

import java.util.Date;

public class BisBeautyRecord {
    private String recordId;

    private String orderId;

    private String cdkey;

    private String customUserId;

    private Integer beautyNum;

    private Integer giveNum;

    private Double totalMoney;

    private Double singePrice;

    private String recordType;

    private Date payTime;

    private String vaildStatus;

    private String shopId;

    private Integer remainNum;

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

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey == null ? null : cdkey.trim();
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

    public Integer getGiveNum() {
        return giveNum;
    }

    public void setGiveNum(Integer giveNum) {
        this.giveNum = giveNum;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Double getSingePrice() {
        return singePrice;
    }

    public void setSingePrice(Double singePrice) {
        this.singePrice = singePrice;
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

    public String getVaildStatus() {
        return vaildStatus;
    }

    public void setVaildStatus(String vaildStatus) {
        this.vaildStatus = vaildStatus == null ? null : vaildStatus.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public Integer getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }

    @Override
    public String toString() {
        return "BisBeautyRecord{" +
                "recordId='" + recordId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", cdkey='" + cdkey + '\'' +
                ", customUserId='" + customUserId + '\'' +
                ", beautyNum=" + beautyNum +
                ", giveNum=" + giveNum +
                ", totalMoney=" + totalMoney +
                ", singePrice=" + singePrice +
                ", recordType='" + recordType + '\'' +
                ", payTime=" + payTime +
                ", vaildStatus='" + vaildStatus + '\'' +
                ", shopId='" + shopId + '\'' +
                ", remainNum=" + remainNum +
                '}';
    }
}