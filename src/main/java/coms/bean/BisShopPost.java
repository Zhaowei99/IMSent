package coms.bean;

import java.util.Date;

public class BisShopPost {
    private String postId;

    private String postName;

    private String postCode;

    private String postDesc;

    private Date createTime;

    private String createUserId;

    private Date modifyTime;

    private String modifyUserId;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc == null ? null : postDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId == null ? null : modifyUserId.trim();
    }

    @Override
    public String toString() {
        return "BisShopPost{" +
                "postId='" + postId + '\'' +
                ", postName='" + postName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", modifyTime=" + modifyTime +
                ", modifyUserId='" + modifyUserId + '\'' +
                '}';
    }
}