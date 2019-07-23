package coms.bean;

import java.util.Date;

public class BisOpinion {
    private String opinionId;

    private String customUserId;

    private Date createTime;

    private String content;

    public String getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(String opinionId) {
        this.opinionId = opinionId == null ? null : opinionId.trim();
    }

    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId == null ? null : customUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "BisOpinion{" +
                "opinionId='" + opinionId + '\'' +
                ", customUserId='" + customUserId + '\'' +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                '}';
    }
}