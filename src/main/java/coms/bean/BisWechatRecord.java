package coms.bean;

import java.util.Date;

public class BisWechatRecord {
    private String recordId;

    private String content;

    private String recordType;

    private String sendUserId;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId == null ? null : sendUserId.trim();
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
        return "BisWechatRecord{" +
                "recordId='" + recordId + '\'' +
                ", content='" + content + '\'' +
                ", recordType='" + recordType + '\'' +
                ", sendUserId='" + sendUserId + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                ", status='" + status + '\'' +
                ", sendTime=" + sendTime +
                ", failureCause='" + failureCause + '\'' +
                '}';
    }
}