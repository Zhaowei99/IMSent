package coms.bean;

import java.util.Date;

public class SysRoleUser {
    private String roleId;

    private String userId;

    private String createUserId;

    private Date createTime;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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

    @Override
    public String toString() {
        return "SysRoleUser{" +
                "roleId='" + roleId + '\'' +
                ", userId='" + userId + '\'' +
                ", createUserId='" + createUserId + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}