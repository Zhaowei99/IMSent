package coms.bean;

import java.util.Date;

public class BisBagRecord {
    private String recordId;

    private String bagId;

    private Integer validDay;

    private String customUserId;

    private Integer buyNum;

    private Integer shareNum;

    private Date createTime;

    private String orderId;

    private String shareUserId;

    private Date bagTime;

    private String recordType;

    private String status;

    private String receiveStatus;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId == null ? null : bagId.trim();
    }

    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getShareNum() {
        return shareNum;
    }

    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getShareUserId() {
        return shareUserId;
    }

    public void setShareUserId(String shareUserId) {
        this.shareUserId = shareUserId == null ? null : shareUserId.trim();
    }

    public Date getBagTime() {
        return bagTime;
    }

    public void setBagTime(Date bagTime) {
        this.bagTime = bagTime;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(String receiveStatus) {
        this.receiveStatus = receiveStatus == null ? null : receiveStatus.trim();
    }

    @Override
    public String toString() {
        return "BisBagRecord{" +
                "recordId='" + recordId + '\'' +
                ", bagId='" + bagId + '\'' +
                ", validDay=" + validDay +
                ", customUserId='" + customUserId + '\'' +
                ", buyNum=" + buyNum +
                ", shareNum=" + shareNum +
                ", createTime=" + createTime +
                ", orderId='" + orderId + '\'' +
                ", shareUserId='" + shareUserId + '\'' +
                ", bagTime=" + bagTime +
                ", recordType='" + recordType + '\'' +
                ", status='" + status + '\'' +
                ", receiveStatus='" + receiveStatus + '\'' +
                '}';
    }
}