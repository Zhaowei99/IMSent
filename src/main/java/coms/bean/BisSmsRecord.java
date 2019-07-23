package coms.bean;

import java.util.Date;

public class BisSmsRecord {
    private String recordId;

    private String mobile;

    private String content;

    private String smsType;

    private String sendUserId;

    private String userType;

    private String createUserId;

    private Date createTime;

    private String status;

    private Date sendTime;

    private String failureCause;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSmsType() {
        return smsType;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType == null ? null : smsType.trim();
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId == null ? null : sendUserId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause == null ? null : failureCause.trim();
    }

    @Override
    public String toString() {
        return "BisSmsRecord{" +
                "recordId='" + recordId + '\'' +
                ", mobile='" + mobile + '\'' +
                ", content='" + content + '\'' +
                ", smsType='" + smsType + '\'' +
                ", sendUserId='" + sendUserId + '\'' +
                ", userType='" + userType + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                ", status='" + status + '\'' +
                ", sendTime=" + sendTime +
                ", failureCause='" + failureCause + '\'' +
                '}';
    }
}