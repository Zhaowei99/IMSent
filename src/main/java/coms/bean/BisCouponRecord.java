package coms.bean;

import java.util.Date;

public class BisCouponRecord {
    private String recordId;

    private String activeId;

    private String cdkey;

    private String mobile;

    private String status;

    private Date createTime;

    private Date exchangeTime;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId == null ? null : activeId.trim();
    }

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey == null ? null : cdkey.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Date exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    @Override
    public String toString() {
        return "BisCouponRecord{" +
                "recordId='" + recordId + '\'' +
                ", activeId='" + activeId + '\'' +
                ", cdkey='" + cdkey + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", exchangeTime=" + exchangeTime +
                '}';
    }
}