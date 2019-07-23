package coms.bean;

import java.util.Date;

public class BisPostMenu {
    private String postId;

    private String menuId;

    private Date createTime;

    private String createUserId;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
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

    @Override
    public String toString() {
        return "BisPostMenu{" +
                "postId='" + postId + '\'' +
                ", menuId='" + menuId + '\'' +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                '}';
    }
}